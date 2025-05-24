package com.minus.mobinogi.config.properties;

import com.minus.mobinogi.utils.s3.Bucket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bucket")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class BucketProperties {
    private String bucketName;
    private String accessKey;
    private String secretKey;

    public Bucket parse() {
        return new Bucket(bucketName, accessKey, secretKey);
    }
}
