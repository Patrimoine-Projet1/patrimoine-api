package com.harena.api.file;

import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Request;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Response;
import software.amazon.awssdk.services.s3.model.S3Object;

import java.io.File;
import java.util.List;

@Component

public class CustomBucketComponent {
    private final BucketComponent bucketComponent;
    private final S3Client s3Client;

    public CustomBucketComponent(BucketComponent bucketComponent, BucketConf bucketConf) {
        this.bucketComponent = bucketComponent;
        this.s3Client = bucketConf.getS3Client();
    }

    public List<File> loadFilesFromS3(int page, int size){
        ListObjectsV2Request listObjectsV2Request = ListObjectsV2Request.builder()
                .bucket(bucketComponent.getBucketName())
                .maxKeys(page)
                .build();
        ListObjectsV2Response listObjectsV2Response = s3Client.listObjectsV2(listObjectsV2Request);

        List<S3Object> contents = listObjectsV2Response.contents();

        return contents.stream().map(o -> bucketComponent.download(o.key())).toList();
    }
}
