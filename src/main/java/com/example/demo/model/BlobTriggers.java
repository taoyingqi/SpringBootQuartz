package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
public class BlobTriggers {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private Blob blobData;

}
