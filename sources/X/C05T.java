package X;

import android.database.Cursor;
import com.whatsapp.MediaData;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;

/* renamed from: X.05T  reason: invalid class name */
/* loaded from: classes.dex */
public class C05T {
    public static volatile C05T A02;
    public final AnonymousClass034 A00;
    public final AnonymousClass012 A01;

    public C05T(AnonymousClass012 anonymousClass012, AnonymousClass034 anonymousClass034) {
        this.A01 = anonymousClass012;
        this.A00 = anonymousClass034;
    }

    public static C05T A00() {
        if (A02 == null) {
            synchronized (C05T.class) {
                if (A02 == null) {
                    A02 = new C05T(AnonymousClass012.A00(), AnonymousClass034.A00());
                }
            }
        }
        return A02;
    }

    public static Object A01(Object obj, AnonymousClass034 anonymousClass034) {
        C09H c09h;
        File file;
        MediaData mediaData;
        File file2;
        if ((obj instanceof MediaData) && (file2 = (mediaData = (MediaData) obj).file) != null && file2.isAbsolute()) {
            MediaData mediaData2 = new MediaData(mediaData);
            mediaData2.autodownloadRetryEnabled = mediaData.autodownloadRetryEnabled;
            mediaData2.progress = mediaData.progress;
            mediaData2.A00 = mediaData.A00;
            mediaData2.transcoded = mediaData.transcoded;
            mediaData2.trimFrom = mediaData.trimFrom;
            mediaData2.trimTo = mediaData.trimTo;
            mediaData2.hasStreamingSidecar = mediaData.hasStreamingSidecar;
            mediaData2.file = new File(anonymousClass034.A03.toURI().relativize(mediaData2.file.toURI()).getPath());
            return mediaData2;
        } else if ((obj instanceof C09H) && (file = (c09h = (C09H) obj).A0F) != null && file.isAbsolute()) {
            MediaData A01 = c09h.A01();
            A01.file = new File(anonymousClass034.A03.toURI().relativize(A01.file.toURI()).getPath());
            return A01;
        } else {
            return obj;
        }
    }

    public static void A02(int i, Object obj, C0CF c0cf) {
        if (obj == null) {
            c0cf.A02(i);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
        c0cf.A00.bindBlob(i, byteArrayOutputStream.toByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(X.AnonymousClass092 r7, X.C0CF r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05T.A03(X.092, X.0CF, int, int):void");
    }

    public static boolean A04(Cursor cursor, int i) {
        return cursor.getLong(i) == 1;
    }

    public void A05(AnonymousClass092 anonymousClass092, C0CF c0cf) {
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            c0cf.A05(1, abstractC005302j.getRawString());
            c0cf.A04(2, anonymousClass094.A02 ? 1L : 0L);
            c0cf.A05(3, anonymousClass094.A01);
            c0cf.A04(4, anonymousClass092.A08);
            c0cf.A04(5, anonymousClass092.A0f ? 2L : 0L);
            A03(anonymousClass092, c0cf, 22, 6);
            c0cf.A04(7, anonymousClass092.A0E);
            String A0O = anonymousClass092.A0O();
            if (A0O == null) {
                c0cf.A02(8);
            } else {
                c0cf.A05(8, A0O);
            }
            String A0M = anonymousClass092.A0M();
            if (A0M == null) {
                c0cf.A02(9);
            } else {
                c0cf.A05(9, A0M);
            }
            c0cf.A04(10, anonymousClass092.A0m);
            c0cf.A04(11, anonymousClass092.A08());
            String A0N = anonymousClass092.A0N();
            if (A0N == null) {
                c0cf.A02(12);
            } else {
                c0cf.A05(12, A0N);
            }
            String A0J = anonymousClass092.A0J();
            if (A0J == null) {
                c0cf.A02(13);
            } else {
                c0cf.A05(13, A0J);
            }
            String A0L = anonymousClass092.A0L();
            if (A0L == null) {
                c0cf.A02(14);
            } else {
                c0cf.A05(14, A0L);
            }
            c0cf.A04(15, anonymousClass092.A04());
            c0cf.A04(16, anonymousClass092.A04);
            c0cf.A03(17, anonymousClass092.A01());
            c0cf.A03(18, anonymousClass092.A02());
            A02(19, A01(anonymousClass092.A0F(), this.A00), c0cf);
            String A0I = anonymousClass092.A0I();
            if (A0I == null) {
                c0cf.A02(20);
            } else {
                c0cf.A05(20, A0I);
            }
            long j = anonymousClass092.A0C;
            if (j == 0) {
                j = this.A01.A05();
            }
            c0cf.A04(21, j);
            String str = anonymousClass092.A0a;
            if (str == null) {
                c0cf.A02(23);
            } else {
                c0cf.A05(23, str);
            }
            c0cf.A04(24, anonymousClass092.A06);
            c0cf.A04(25, anonymousClass092.A0B);
            String A0v = AnonymousClass029.A0v(anonymousClass092.A0c);
            if (A0v == null) {
                c0cf.A02(26);
            } else {
                c0cf.A05(26, A0v);
            }
            String A0H = anonymousClass092.A0H();
            if (A0H == null) {
                c0cf.A02(27);
            } else {
                c0cf.A05(27, A0H);
            }
            c0cf.A04(28, anonymousClass092.A00);
            String A0K = anonymousClass092.A0K();
            if (A0K == null) {
                c0cf.A02(29);
            } else {
                c0cf.A05(29, A0K);
            }
            String str2 = anonymousClass092.A0b;
            if (str2 == null) {
                c0cf.A02(30);
            } else {
                c0cf.A05(30, str2);
            }
            c0cf.A04(31, anonymousClass092.A07());
            c0cf.A04(32, anonymousClass092.A05());
            c0cf.A04(33, anonymousClass092.A09());
            return;
        }
        throw null;
    }

    public final void A06(AnonymousClass092 anonymousClass092, C0CF c0cf) {
        c0cf.A04(1, anonymousClass092.A08);
        c0cf.A04(2, anonymousClass092.A0f ? 2L : 0L);
        A03(anonymousClass092, c0cf, 4, 3);
        c0cf.A04(5, anonymousClass092.A0E);
        String A0O = anonymousClass092.A0O();
        if (A0O == null) {
            c0cf.A02(6);
        } else {
            c0cf.A05(6, A0O);
        }
        String A0M = anonymousClass092.A0M();
        if (A0M == null) {
            c0cf.A02(7);
        } else {
            c0cf.A05(7, A0M);
        }
        c0cf.A04(8, anonymousClass092.A0m);
        c0cf.A04(9, anonymousClass092.A08());
        String A0N = anonymousClass092.A0N();
        if (A0N == null) {
            c0cf.A02(10);
        } else {
            c0cf.A05(10, A0N);
        }
        String A0J = anonymousClass092.A0J();
        if (A0J == null) {
            c0cf.A02(11);
        } else {
            c0cf.A05(11, A0J);
        }
        String A0L = anonymousClass092.A0L();
        if (A0L == null) {
            c0cf.A02(12);
        } else {
            c0cf.A05(12, A0L);
        }
        c0cf.A04(13, anonymousClass092.A04());
        c0cf.A04(14, anonymousClass092.A04);
        c0cf.A03(15, anonymousClass092.A01());
        c0cf.A03(16, anonymousClass092.A02());
        String A0v = AnonymousClass029.A0v(anonymousClass092.A0c);
        if (A0v == null) {
            c0cf.A02(17);
        } else {
            c0cf.A05(17, A0v);
        }
        A02(18, A01(anonymousClass092.A0F(), this.A00), c0cf);
        c0cf.A04(19, anonymousClass092.A00);
        String A0K = anonymousClass092.A0K();
        if (A0K == null) {
            c0cf.A02(20);
        } else {
            c0cf.A05(20, A0K);
        }
        String str = anonymousClass092.A0b;
        if (str == null) {
            c0cf.A02(21);
        } else {
            c0cf.A05(21, str);
        }
        c0cf.A04(22, anonymousClass092.A07());
        c0cf.A04(23, anonymousClass092.A05());
        c0cf.A04(24, anonymousClass092.A0B);
        c0cf.A04(25, anonymousClass092.A09());
    }

    public final void A07(AnonymousClass092 anonymousClass092, C0CF c0cf) {
        c0cf.A04(1, anonymousClass092.A08);
        c0cf.A04(2, 2L);
        A03(anonymousClass092, c0cf, 4, 3);
        c0cf.A04(5, anonymousClass092.A0E);
        String A0O = anonymousClass092.A0O();
        if (A0O == null) {
            c0cf.A02(6);
        } else {
            c0cf.A05(6, A0O);
        }
        String A0M = anonymousClass092.A0M();
        if (A0M == null) {
            c0cf.A02(7);
        } else {
            c0cf.A05(7, A0M);
        }
        c0cf.A04(8, anonymousClass092.A0m);
        c0cf.A04(9, anonymousClass092.A08());
        String A0N = anonymousClass092.A0N();
        if (A0N == null) {
            c0cf.A02(10);
        } else {
            c0cf.A05(10, A0N);
        }
        String A0J = anonymousClass092.A0J();
        if (A0J == null) {
            c0cf.A02(11);
        } else {
            c0cf.A05(11, A0J);
        }
        String A0L = anonymousClass092.A0L();
        if (A0L == null) {
            c0cf.A02(12);
        } else {
            c0cf.A05(12, A0L);
        }
        c0cf.A04(13, anonymousClass092.A04());
        c0cf.A04(14, anonymousClass092.A04);
        c0cf.A03(15, anonymousClass092.A01());
        c0cf.A03(16, anonymousClass092.A02());
        String A0v = AnonymousClass029.A0v(anonymousClass092.A0c);
        if (A0v == null) {
            c0cf.A02(17);
        } else {
            c0cf.A05(17, A0v);
        }
        A02(18, A01(anonymousClass092.A0F(), this.A00), c0cf);
        String A0K = anonymousClass092.A0K();
        if (A0K == null) {
            c0cf.A02(19);
        } else {
            c0cf.A05(19, A0K);
        }
    }
}
