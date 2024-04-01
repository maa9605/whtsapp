package X;

import android.database.Cursor;
import android.util.Base64;
import android.util.Pair;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2AM */
/* loaded from: classes2.dex */
public class C2AM extends C2AN {
    public static volatile C2AM A0A;
    public final C012005w A00;
    public final C018508q A01;
    public final C0F2 A02;
    public final C40411sD A03;
    public final C41521u3 A04;
    public final C2CA A05;
    public final C2Bk A06;
    public final C2AS A07;
    public final C2D4 A08;
    public final ExecutorC004702d A09;

    public C2AM(C018508q c018508q, InterfaceC002901k interfaceC002901k, C012005w c012005w, C41521u3 c41521u3, C2Bk c2Bk, C2AS c2as, C40411sD c40411sD, C2D4 c2d4, C0F2 c0f2) {
        super(c2d4, 32);
        this.A01 = c018508q;
        this.A00 = c012005w;
        this.A04 = c41521u3;
        this.A06 = c2Bk;
        this.A07 = c2as;
        this.A03 = c40411sD;
        this.A08 = c2d4;
        this.A02 = c0f2;
        this.A09 = new ExecutorC004702d(interfaceC002901k, false);
        this.A05 = new C2CA();
    }

    public static C2AM A00() {
        if (A0A == null) {
            synchronized (C2AM.class) {
                if (A0A == null) {
                    C018508q A00 = C018508q.A00();
                    InterfaceC002901k A002 = C002801j.A00();
                    C012005w A003 = C012005w.A00();
                    C41521u3 A004 = C41521u3.A00();
                    C2Bk A005 = C2Bk.A00();
                    C2AS A006 = C2AS.A00();
                    C40411sD A007 = C40411sD.A00();
                    if (C2D4.A02 == null) {
                        synchronized (C2D4.class) {
                            if (C2D4.A02 == null) {
                                C2D4.A02 = new C2D4(C40431sF.A00());
                            }
                        }
                    }
                    A0A = new C2AM(A00, A002, A003, A004, A005, A006, A007, C2D4.A02, C0F2.A00());
                }
            }
        }
        return A0A;
    }

    @Override // X.C2AN
    public void A08(int i) {
        C000700j.A00();
        C2D5 c2d5 = (C2D5) A01(i);
        StringBuilder A0P = C000200d.A0P("RecentStickers/removeEntry/removing entry: ");
        A0P.append(c2d5.toString());
        Log.i(A0P.toString());
        C0F2 c0f2 = this.A02;
        String str = c2d5.A01;
        c0f2.A09(str);
        this.A05.A02(str, c2d5.A02);
        super.A08(i);
    }

    @Override // X.C2AN
    public void A09(C2BY c2by) {
        C2D6 c2d6 = (C2D6) c2by;
        C000700j.A00();
        StringBuilder sb = new StringBuilder("RecentStickers/addEntry/adding entry:");
        sb.append(c2d6.toString());
        Log.i(sb.toString());
        C2CA c2ca = this.A05;
        C2D5 c2d5 = c2d6.A01;
        c2ca.A01(c2d5.A01, c2d5.A02);
        super.A09(c2d6);
    }

    public C0JM A0B(String str) {
        Iterator it = ((AbstractCollection) A0C()).iterator();
        while (it.hasNext()) {
            C0JM c0jm = (C0JM) it.next();
            if (str.equals(c0jm.A0B)) {
                return c0jm;
            }
        }
        return null;
    }

    public List A0C() {
        List<C2D5> A02 = super.A02();
        ArrayList arrayList = new ArrayList();
        for (C2D5 c2d5 : A02) {
            C2CA c2ca = this.A05;
            String str = c2d5.A01;
            c2ca.A01(str, c2d5.A02);
            C0JM c0jm = c2d5.A00;
            if (c0jm.A0B == null) {
                c0jm.A0B = str;
            }
            c0jm.A0A = "image/webp";
            String str2 = c0jm.A0B;
            String str3 = null;
            if (str2 == null) {
                Log.e("RecentStickers/setRecentStickerFilePath/sticker param has null file hash");
            } else {
                File A05 = this.A02.A05(str2);
                c0jm.A08 = A05.getAbsolutePath();
                c0jm.A01 = 1;
                str3 = A05.getAbsolutePath();
            }
            if (str3 != null) {
                c0jm.A04 = C04050If.A00(WebpUtils.fetchWebpMetadata(str3));
            }
            arrayList.add(c0jm.clone());
        }
        return arrayList;
    }

    public List A0D(boolean z) {
        C0JM c0jm;
        List<C2D5> A02 = super.A02();
        for (C2D5 c2d5 : A02) {
            if (z) {
                C2D4 c2d4 = this.A08;
                String str = c2d5.A01;
                C0JM c0jm2 = null;
                if (c2d4 != null) {
                    String[] strArr = {str};
                    C0CD A022 = c2d4.A00.A06().A02();
                    try {
                        Cursor A09 = A022.A02.A09("recent_stickers", C2D7.A00, "plaintext_hash = ?", strArr, null, "getStickerFromFileHash/QUERY_RECENT_STICKER");
                        if (A09.moveToNext()) {
                            c0jm = new C0JM();
                            c0jm.A0B = str;
                            c0jm.A0E = A09.getString(A09.getColumnIndexOrThrow("url"));
                            c0jm.A07 = A09.getString(A09.getColumnIndexOrThrow("enc_hash"));
                            c0jm.A05 = A09.getString(A09.getColumnIndexOrThrow("direct_path"));
                            c0jm.A0A = A09.getString(A09.getColumnIndexOrThrow("mimetype"));
                            c0jm.A09 = A09.getString(A09.getColumnIndexOrThrow("media_key"));
                            c0jm.A00 = A09.getInt(A09.getColumnIndexOrThrow("file_size"));
                            c0jm.A03 = A09.getInt(A09.getColumnIndexOrThrow("width"));
                            c0jm.A02 = A09.getInt(A09.getColumnIndexOrThrow("height"));
                            c0jm.A06 = A09.getString(A09.getColumnIndexOrThrow("emojis"));
                            c0jm.A0F = A09.getInt(A09.getColumnIndexOrThrow("is_first_party")) == 1;
                            A09.close();
                        } else {
                            A09.close();
                            A022.close();
                            StringBuilder sb = new StringBuilder("RecentStickerDBStorage/getStickerFromFileHash/sticker unable to be retrieved from recent stickers db: filehash = ");
                            sb.append(str);
                            Log.e(sb.toString());
                            c0jm = null;
                        }
                        if (c0jm == null) {
                            Log.e("RecentStickers/getStickerListAndWeights/recent sticker not found in db");
                        } else if (c0jm.A05 != null) {
                            c2d5.A00(c0jm);
                        } else {
                            C42481vo A092 = this.A03.A09(str, (byte) 20, true);
                            if (A092 != null) {
                                c0jm2 = new C0JM();
                                c0jm2.A0B = str;
                                c0jm2.A0E = A092.A04;
                                c0jm2.A07 = A092.A03;
                                C09H c09h = A092.A02;
                                c0jm2.A05 = c09h.A0G;
                                c0jm2.A0A = "image/webp";
                                byte[] bArr = c09h.A0U;
                                if (bArr != null) {
                                    c0jm2.A09 = Base64.encodeToString(bArr, 3);
                                }
                                c0jm2.A00 = (int) c09h.A0A;
                                c0jm2.A03 = c09h.A08;
                                c0jm2.A02 = c09h.A06;
                            }
                            if (c0jm2 != null) {
                                c2d4.A00(c0jm2);
                                c2d5.A00(c0jm2);
                            }
                        }
                    } finally {
                    }
                } else {
                    throw null;
                }
            }
            C0JM c0jm3 = c2d5.A00;
            if (c0jm3.A0A == null) {
                c0jm3.A0A = "image/webp";
            }
        }
        Map A03 = super.A03();
        ArrayList arrayList = new ArrayList();
        for (C2D5 c2d52 : A02) {
            C0JM clone = c2d52.A00.clone();
            String str2 = clone.A0B;
            if (str2 == null) {
                Log.e("RecentStickers/setRecentStickerFilePath/sticker param has null file hash");
            } else {
                File A05 = this.A02.A05(str2);
                clone.A08 = A05.getAbsolutePath();
                clone.A01 = 1;
                A05.getAbsolutePath();
            }
            arrayList.add(new Pair(clone, ((AbstractMap) A03).get(c2d52)));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void A0E(X.C0JM r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2AM.A0E(X.0JM, boolean):void");
    }

    public void A0F(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, String str7, boolean z) {
        C0JM c0jm = new C0JM();
        c0jm.A0B = str;
        if (str2 != null) {
            c0jm.A0E = str2;
        }
        if (str3 != null) {
            c0jm.A07 = str3;
        }
        if (str4 != null) {
            c0jm.A05 = str4;
        }
        if (str5 != null) {
            c0jm.A0A = str5;
        }
        if (str6 != null) {
            c0jm.A09 = str6;
        }
        c0jm.A00 = i;
        c0jm.A03 = i2;
        c0jm.A02 = i3;
        c0jm.A06 = str7;
        c0jm.A0F = z;
        this.A08.A00(c0jm);
        for (C2D5 c2d5 : super.A02()) {
            if (str.equals(c2d5.A01)) {
                c2d5.A00(c0jm);
            }
        }
    }
}
