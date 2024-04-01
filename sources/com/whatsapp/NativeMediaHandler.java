package com.whatsapp;

import X.C000200d;
import X.C001200o;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public class NativeMediaHandler {
    public static volatile NativeMediaHandler A01;
    public final C001200o A00;

    public static native void initFileHandlingCallbacks(NativeMediaHandler nativeMediaHandler);

    public NativeMediaHandler(C001200o c001200o) {
        this.A00 = c001200o;
    }

    public int openFile(String str, String str2) {
        Uri parse;
        if (str != null && str2 != null) {
            if (str.startsWith("/mnt/content/")) {
                StringBuilder A0P = C000200d.A0P("content://");
                A0P.append(str.substring(13));
                parse = Uri.parse(A0P.toString());
            } else if (str.startsWith("/")) {
                parse = Uri.fromFile(new File(str));
            } else {
                parse = Uri.parse(str);
            }
            if ("r+".equals(str2)) {
                str2 = "rw";
            }
            try {
                ParcelFileDescriptor openFileDescriptor = this.A00.A00.getContentResolver().openFileDescriptor(parse, str2);
                if (openFileDescriptor == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("nativemediahandler/openFile failed, not opened; uri=");
                    sb.append(parse);
                    sb.append("; mode=");
                    sb.append(str2);
                    sb.append("; path=");
                    sb.append(str);
                    Log.e(sb.toString());
                    return 0;
                }
                int detachFd = openFileDescriptor.detachFd();
                openFileDescriptor.close();
                return detachFd;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("nativemediahandler/openFile failed; uri=");
                sb2.append(parse);
                sb2.append("; mode=");
                sb2.append(str2);
                sb2.append("; path=");
                sb2.append(str);
                Log.e(sb2.toString(), e);
                return 0;
            }
        }
        StringBuilder sb3 = new StringBuilder("nativemediahandler/openFile wrong arguments; path=");
        sb3.append(str);
        sb3.append(" mode=");
        sb3.append(str2);
        Log.e(sb3.toString());
        return 0;
    }
}
