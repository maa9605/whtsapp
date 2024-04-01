package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.2aE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52202aE implements InterfaceC52102a4, InterfaceC52182aC {
    public final int A00;
    public final long A01;
    public final ContentResolver A02;
    public final Uri A03;
    public final File A04;
    public final boolean A05;

    @Override // X.InterfaceC52102a4
    public long A9h() {
        return 0L;
    }

    @Override // X.InterfaceC52102a4
    public long A9q() {
        return 0L;
    }

    @Override // X.InterfaceC52102a4
    public String ABN() {
        return "image/*";
    }

    @Override // X.InterfaceC52182aC
    public byte ADz() {
        return (byte) 1;
    }

    @Override // X.InterfaceC52102a4
    public int getType() {
        return 0;
    }

    public C52202aE(ContentResolver contentResolver, File file, boolean z, int i) {
        Uri.Builder buildUpon = Uri.fromFile(file).buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("flip-h", "1");
        }
        if (i != 0) {
            buildUpon.appendQueryParameter("rotation", Integer.toString(i));
        }
        Uri build = buildUpon.build();
        long length = file.length();
        this.A02 = contentResolver;
        this.A03 = build;
        this.A01 = length;
        this.A04 = file;
        this.A05 = z;
        this.A00 = i;
    }

    @Override // X.InterfaceC52102a4
    public Uri A88() {
        return this.A03;
    }

    @Override // X.InterfaceC52102a4
    public String A9f() {
        return this.A03.getPath();
    }

    @Override // X.InterfaceC52182aC
    public File AAA() {
        return this.A04;
    }

    @Override // X.InterfaceC52182aC
    public int ACu() {
        return this.A00;
    }

    @Override // X.InterfaceC52182aC
    public boolean AFH() {
        return this.A05;
    }

    @Override // X.InterfaceC52102a4
    public Bitmap AVV(int i) {
        Matrix A0A;
        ParcelFileDescriptor parcelFileDescriptor;
        Bitmap A03;
        long j = i;
        long j2 = j * j * 2;
        Bitmap bitmap = null;
        try {
            ContentResolver contentResolver = this.A02;
            Uri uri = this.A03;
            A0A = C0DD.A0A(contentResolver, uri);
            try {
                File A05 = AnonymousClass024.A05(uri);
                if (A05 != null) {
                    parcelFileDescriptor = ParcelFileDescriptor.open(A05, 268435456);
                } else {
                    parcelFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                }
            } catch (FileNotFoundException unused) {
                parcelFileDescriptor = null;
            }
            A03 = C43981yK.A03(i, j2, parcelFileDescriptor);
        } catch (Exception e) {
            Log.e("UriImage", "got exception decoding bitmap ", e);
        }
        if (A0A == null || A0A.isIdentity()) {
            return A03;
        }
        if (A03 != null) {
            bitmap = Bitmap.createBitmap(A03, 0, 0, A03.getWidth(), A03.getHeight(), A0A, true);
            return bitmap;
        }
        return bitmap;
    }

    @Override // X.InterfaceC52102a4
    public long getContentLength() {
        return this.A01;
    }
}
