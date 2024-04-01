package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.animated.gif.GifImage;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.1sz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC40861sz implements Closeable {
    public static C42661w7 A04(ContentResolver contentResolver, C02C c02c, Uri uri) {
        if (contentResolver != null) {
            c02c.A03(uri);
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                if (openFileDescriptor != null) {
                    c02c.A04(openFileDescriptor);
                    C42661w7 A02 = C40851sy.A02(openFileDescriptor);
                    openFileDescriptor.close();
                    return A02;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("gifdecoder/getmetadata/cannot open uri, pfd=null, uri=");
                sb.append(uri);
                throw new IOException(sb.toString());
            } catch (SecurityException e) {
                StringBuilder sb2 = new StringBuilder("gifdecoder/getmetadata/failed to read uri ");
                sb2.append(uri);
                Log.e(sb2.toString(), e);
                throw new IOException(e);
            }
        }
        throw new IOException("gifdecoder/getmetadata/cannot open uri, cr=null");
    }

    public int A05() {
        return ((C40851sy) this).A01.getHeight();
    }

    public int A06() {
        return ((C40851sy) this).A01.getFrameCount();
    }

    public int A07() {
        return ((C40851sy) this).A01.getWidth();
    }

    public int A08(int i) {
        return ((C40851sy) this).A01.getFrameDurations()[i];
    }

    public Bitmap A09(int i) {
        C40851sy c40851sy = (C40851sy) this;
        C000700j.A06(i >= 0);
        GifImage gifImage = c40851sy.A01;
        C000700j.A06(i < gifImage.getFrameCount());
        Bitmap createBitmap = Bitmap.createBitmap(gifImage.getWidth(), gifImage.getHeight(), Bitmap.Config.ARGB_8888);
        c40851sy.A02.A00(i, createBitmap);
        return createBitmap;
    }
}
