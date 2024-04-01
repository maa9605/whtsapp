package com.whatsapp.settings;

import X.C2P7;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class Licenses extends C2P7 {
    @Override // X.C2P7, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        InputStream openRawResource;
        ByteArrayOutputStream byteArrayOutputStream;
        super.onCreate(bundle);
        setContentView(R.layout.licenses);
        TextView textView = (TextView) findViewById(R.id.licenses_view);
        try {
            openRawResource = getResources().openRawResource(R.raw.notices);
            int available = openRawResource.available();
            if (available <= 0) {
                available = 32;
            }
            byteArrayOutputStream = new ByteArrayOutputStream(available);
        } catch (IOException e) {
            Log.e("licenses/cannot-load ", e);
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openRawResource.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String str = byteArrayOutputStream.toString();
            openRawResource.close();
            if (str == null) {
                str = getString(R.string.unable_to_load_licenses);
            }
            textView.setText(str);
        } finally {
        }
    }
}
