package ld.com.senkotlin.utils;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;


import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

/**
 * Created by lorin on 17/8/16.
 */

public class PermissionUtil {

    public static final String[] PERMISSIONS_EXTERNAL_WRITE = {
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    public static final int REQUEST_EXTERNAL_WRITE = 3;

    public static boolean checkWriteStoragePermission(Activity context) {

        int writeStoragePermissionState =
                ContextCompat.checkSelfPermission(context, WRITE_EXTERNAL_STORAGE);

        boolean writeStoragePermissionGranted = writeStoragePermissionState == PackageManager.PERMISSION_GRANTED;

        if (!writeStoragePermissionGranted) {
            ActivityCompat.requestPermissions(context, PERMISSIONS_EXTERNAL_WRITE,
                    REQUEST_EXTERNAL_WRITE);
        }
        return writeStoragePermissionGranted;
    }
}
