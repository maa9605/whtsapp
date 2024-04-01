package X;

import android.graphics.Bitmap;
import com.whatsapp.media.transcode.Mozjpeg;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.2z2  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2z2 {
    public static final Mozjpeg A00 = new Mozjpeg();

    public static byte[] A00(Bitmap bitmap, int i, boolean z) {
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            return null;
        }
        try {
            File createTempFile = File.createTempFile(C0DD.A0J(), null);
            A00.A00(bitmap, createTempFile.getAbsolutePath(), i, false, z);
            if (createTempFile.length() <= 0) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(createTempFile));
            byte[] A0o = AnonymousClass024.A0o(bufferedInputStream);
            bufferedInputStream.close();
            createTempFile.delete();
            return A0o;
        } catch (IOException e) {
            Log.e("BitmapCompressor/createCompressedByteArray", e);
            return null;
        }
    }
}
