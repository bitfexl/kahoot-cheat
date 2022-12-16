package com.github.bitfexl.kahootcheat.kahoot.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Kahoot {
    private String title;
    private String id;
    private int questions;
}
