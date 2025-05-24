package com.minus.mobinogi.utils;

import lombok.experimental.UtilityClass;
import software.amazon.awssdk.regions.Region;

@UtilityClass
public class AwsUtils {

    public final String AWS_REGION = "AWS_Region";
    public final String AWS_COMMON_BUCKET_NAME = "APP_ATTACHFILE_DIR";

    public static Region getAwsRegion() {
        String awsRegion = System.getProperty(AWS_REGION);

        return awsRegion != null ? Region.of(awsRegion) : Region.AP_NORTHEAST_2;
    }

}