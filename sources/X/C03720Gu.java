package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;

/* renamed from: X.0Gu */
/* loaded from: classes.dex */
public class C03720Gu {
    public static volatile C03720Gu A05;
    public final AnonymousClass012 A00;
    public final C05Q A01;
    public final C06J A02;
    public final C012506c A03;
    public final C05E A04;

    public C03720Gu(AnonymousClass012 anonymousClass012, C05Q c05q, C012406b c012406b, C05E c05e, C06J c06j) {
        this.A00 = anonymousClass012;
        this.A01 = c05q;
        this.A04 = c05e;
        this.A02 = c06j;
        this.A03 = c012406b.A01;
    }

    public static C03720Gu A00() {
        if (A05 == null) {
            synchronized (C03720Gu.class) {
                if (A05 == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C05L.A00();
                    A05 = new C03720Gu(A00, C05Q.A00(), C012406b.A00(), C05E.A00(), C06J.A01());
                }
            }
        }
        return A05;
    }

    public C0JN A01(AnonymousClass094 anonymousClass094) {
        AnonymousClass092 A052;
        int length;
        if (anonymousClass094 == null || (A052 = this.A01.A05(anonymousClass094)) == null) {
            return null;
        }
        long j = A052.A0p;
        C0CD A03 = this.A04.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT sidecar, chunk_lengths FROM message_streaming_sidecar WHERE message_row_id = ?", new String[]{Long.toString(j)});
            int[] iArr = null;
            if (!A07.moveToLast()) {
                A07.close();
                A03.close();
                return null;
            }
            byte[] blob = A07.getBlob(A07.getColumnIndexOrThrow("sidecar"));
            byte[] blob2 = A07.getBlob(A07.getColumnIndexOrThrow("chunk_lengths"));
            if (blob2 != null && (length = blob2.length) > 0 && length % 4 == 0) {
                int i = length / 4;
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = i2 << 2;
                    iArr[i2] = (blob2[i3 + 3] & 255) | ((blob2[i3] & 255) << 24) | ((blob2[i3 + 1] & 255) << 16) | ((blob2[i3 + 2] & 255) << 8);
                }
            }
            C0JN c0jn = new C0JN(blob, iArr);
            A07.close();
            A03.close();
            return c0jn;
        } finally {
        }
    }

    public void A02(C04030Id c04030Id, long j) {
        boolean z;
        byte[] bArr;
        if (c04030Id != null) {
            synchronized (c04030Id) {
                z = c04030Id.A01;
            }
            if (z) {
                byte[] A06 = c04030Id.A06();
                int[] A07 = c04030Id.A07();
                try {
                    C0CD A04 = this.A04.A04();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_row_id", Long.valueOf(j));
                    contentValues.put("sidecar", A06);
                    if (A07 == null) {
                        bArr = null;
                    } else {
                        int length = A07.length;
                        bArr = new byte[length << 2];
                        for (int i = 0; i < length; i++) {
                            int i2 = i << 2;
                            int i3 = A07[i];
                            bArr[i2 + 3] = (byte) i3;
                            bArr[i2 + 2] = (byte) (i3 >> 8);
                            bArr[i2 + 1] = (byte) (i3 >> 16);
                            bArr[i2] = (byte) (i3 >> 24);
                        }
                    }
                    contentValues.put("chunk_lengths", bArr);
                    contentValues.put("timestamp", Long.valueOf(this.A00.A05()));
                    A04.A02.A06("message_streaming_sidecar", contentValues, 5);
                    A04.close();
                    synchronized (c04030Id) {
                        c04030Id.A01 = false;
                    }
                } catch (SQLiteConstraintException e) {
                    Log.e("SidecarMessageStore/insertStreamingSidecar/", e);
                    throw e;
                }
            }
        }
    }
}
