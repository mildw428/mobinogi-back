package com.minus.mobinogi.utils.s3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Bucket {

    private final String bucketName;
    private final String accessKey;
    private final String secretKey;

}