package com.example.paraphrase;

import android.app.Activity;
import android.os.Bundle;

public class TestActivity extends Activity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    Phrase.simple_test()
        .quick("slow")
        .fox("turtle")
        .lazy("flattened")
        .dog("slug")
        .build(this);
  }
}
