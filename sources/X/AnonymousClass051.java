package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/* renamed from: X.051  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass051 {
    public static final Random A03 = new Random();
    public final C009604x A00;
    public final AnonymousClass012 A01;
    public final C01R A02;

    public AnonymousClass051(AnonymousClass012 anonymousClass012, C01R c01r, C009604x c009604x) {
        this.A01 = anonymousClass012;
        this.A02 = c01r;
        this.A00 = c009604x;
    }

    public static final C27381Nd A00(byte[] bArr, int i, Exception exc) {
        int length;
        if (exc != null) {
            Log.w("axolotl", exc);
        }
        if (i == 0) {
            if (bArr != null && (length = bArr.length) != 0) {
                int i2 = bArr[length - 1] & 255;
                if (i2 == 0) {
                    Log.w("MessageUtil/removePadding/ axolotl derived plaintext has invalid padding");
                } else if (i2 >= length) {
                    Log.w("MessageUtil/removePadding/ axolotl derived entire plaintext as padding");
                } else {
                    int i3 = length - i2;
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr2, 0, i3);
                    if (bArr2.length != 0) {
                        return new C27381Nd(bArr2, 0);
                    }
                }
                return new C27381Nd(null, -10000);
            }
            Log.w("SignalCoordinator/createDecryptionResult axolotl derived null or empty plaintext from message");
            return new C27381Nd(null, -1000);
        }
        return new C27381Nd(null, i);
    }

    public static final boolean A01(C14340mn c14340mn, C14340mn c14340mn2) {
        C13900m0 c13900m0 = c14340mn.A02;
        if (c13900m0 == null) {
            c13900m0 = C13900m0.A03;
        }
        byte[] A0B = c13900m0.A0B();
        C13900m0 c13900m02 = c14340mn2.A02;
        if (c13900m02 == null) {
            c13900m02 = C13900m0.A03;
        }
        if (MessageDigest.isEqual(A0B, c13900m02.A0B())) {
            C13900m0 c13900m03 = c14340mn.A03;
            if (c13900m03 == null) {
                c13900m03 = C13900m0.A03;
            }
            byte[] A0B2 = c13900m03.A0B();
            C13900m0 c13900m04 = c14340mn2.A03;
            if (c13900m04 == null) {
                c13900m04 = C13900m0.A03;
            }
            if (MessageDigest.isEqual(A0B2, c13900m04.A0B())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A02(C14340mn c14340mn, C14340mn c14340mn2) {
        C13900m0 c13900m0 = c14340mn.A02;
        if (c13900m0 == null) {
            c13900m0 = C13900m0.A03;
        }
        byte[] A0B = c13900m0.A0B();
        C13900m0 c13900m02 = c14340mn2.A03;
        if (c13900m02 == null) {
            c13900m02 = C13900m0.A03;
        }
        if (MessageDigest.isEqual(A0B, c13900m02.A0B())) {
            C13900m0 c13900m03 = c14340mn.A03;
            if (c13900m03 == null) {
                c13900m03 = C13900m0.A03;
            }
            byte[] A0B2 = c13900m03.A0B();
            C13900m0 c13900m04 = c14340mn2.A02;
            if (c13900m04 == null) {
                c13900m04 = C13900m0.A03;
            }
            if (MessageDigest.isEqual(A0B2, c13900m04.A0B())) {
                return true;
            }
        }
        return false;
    }

    public static byte[] A03(byte[] bArr) {
        int nextInt = A03.nextInt(16) + 1;
        int length = bArr.length;
        int i = length + nextInt;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        Arrays.fill(bArr2, length, i, (byte) nextInt);
        return bArr2;
    }

    public C0JY A04() {
        C1R9 A01 = this.A00.A01();
        return new C0JY(new C0IP(new C0IR(A01.A00.A00.A00, (byte) 5)), C002701i.A0R(A01.A01));
    }

    public C27411Ng A05(C0QS c0qs) {
        return new C27411Ng(new C1RL(this.A00.A02).A00(C002701i.A15(c0qs)).ASe(), 0);
    }

    public C05020My A06() {
        C05000Mw c05000Mw;
        if (!A09()) {
            A08();
        }
        C04o c04o = this.A00.A04;
        C04j c04j = c04o.A01;
        C0CD A01 = c04j.A01();
        try {
            C05020My c05020My = null;
            Cursor A0A = A01.A02.A0A("prekeys", new String[]{"prekey_id", "record"}, "sent_to_server = 0 AND direct_distribution = 0", null, null, String.valueOf(1));
            if (A0A.moveToNext()) {
                c05000Mw = new C05000Mw(A0A.getInt(0), A0A.getBlob(1));
                A0A.close();
                A01.close();
            } else {
                A0A.close();
                A01.close();
                c05000Mw = null;
            }
            if (c05000Mw != null) {
                try {
                    int i = c05000Mw.A00;
                    c05020My = C009604x.A00(i, new C05010Mx(c05000Mw.A01));
                    if (c05020My != null) {
                        C0CD A02 = c04j.A02();
                        try {
                            ContentValues contentValues = new ContentValues(2);
                            contentValues.put("direct_distribution", Boolean.TRUE);
                            contentValues.put("upload_timestamp", Long.valueOf(c04o.A02.A05() / 1000));
                            boolean z = A02.A02.A00("prekeys", contentValues, "prekey_id=?", new String[]{String.valueOf(i)}) == 1;
                            A02.close();
                            if (!z) {
                                Log.e("Failed to mark key as direct distribution, not sending pre-key with retry receipt");
                            }
                        } finally {
                        }
                    }
                } catch (IOException e) {
                    StringBuilder A0P = C000200d.A0P("error reading prekey ");
                    int i2 = c05000Mw.A00;
                    A0P.append(i2);
                    Log.e(A0P.toString(), e);
                    c04o.A02(i2);
                }
                return c05020My;
            }
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public C1RG A07(C0IO c0io) {
        C009604x c009604x = this.A00;
        return new C1RG(c009604x, c009604x, c009604x.A06, c009604x, new C0XR(c0io.A01, c0io.A00));
    }

    public void A08() {
        C009604x c009604x = this.A00;
        int A07 = c009604x.A00.A07(C01C.A2q);
        int A00 = c009604x.A04.A00();
        if (A00 >= A07) {
            StringBuilder sb = new StringBuilder("skipping key generation because already more than ");
            sb.append(A07);
            sb.append(" are unsent");
            Log.i(sb.toString());
            return;
        }
        while (true) {
            A07 -= A00;
            if (A07 <= 0) {
                return;
            }
            A00 = Math.min(A07, 50);
            int A01 = c009604x.A03.A01();
            StringBuilder sb2 = new StringBuilder("axolotl generating ");
            sb2.append(A00);
            sb2.append(" new prekeys starting from ");
            sb2.append(A01);
            sb2.append(" and recording them in the db");
            Log.i(sb2.toString());
            ArrayList arrayList = new ArrayList();
            LinkedList linkedList = new LinkedList();
            int i = A01 - 1;
            for (int i2 = 0; i2 < A00; i2++) {
                linkedList.add(new C05010Mx(((i + i2) % 16777214) + 1, AnonymousClass029.A14()));
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C13270ks c13270ks = ((C05010Mx) it.next()).A00;
                arrayList.add(new C05000Mw(c13270ks.A01, c13270ks.A0B()));
            }
            c009604x.A07.A0T(arrayList, ((A01 + A00) % 16777214) + 1);
        }
    }

    public boolean A09() {
        C009604x c009604x = this.A00;
        c009604x.A08.A00();
        C0CD A01 = c009604x.A04.A01.A01();
        try {
            Cursor A07 = A01.A02.A07("SELECT COUNT(*) FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0", null);
            if (A07.moveToNext()) {
                boolean z = A07.getInt(0) != 0;
                A07.close();
                A01.close();
                StringBuilder sb = new StringBuilder("axolotl has unsent prekeys: ");
                sb.append(z);
                Log.i(sb.toString());
                return z;
            }
            throw new SQLiteException("Unable to count unsent entries in prekeys table");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
