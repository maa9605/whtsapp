package X;

import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Bn */
/* loaded from: classes2.dex */
public class C47512Bn {
    public static volatile C47512Bn A08;
    public final C018508q A00;
    public final C001200o A01;
    public final C47582Bu A02;
    public final C2Bk A03;
    public final C42351vb A04;
    public final C2CC A05;
    public final C2CD A06;
    public final C40401sA A07;

    public C47512Bn(C001200o c001200o, C018508q c018508q, C2Bk c2Bk, C42351vb c42351vb, C47582Bu c47582Bu, C2CC c2cc, C40401sA c40401sA, C2CD c2cd) {
        this.A01 = c001200o;
        this.A00 = c018508q;
        this.A03 = c2Bk;
        this.A04 = c42351vb;
        this.A02 = c47582Bu;
        this.A05 = c2cc;
        this.A07 = c40401sA;
        this.A06 = c2cd;
    }

    public static C47512Bn A00() {
        if (A08 == null) {
            synchronized (C47512Bn.class) {
                if (A08 == null) {
                    C001200o c001200o = C001200o.A01;
                    C018508q A00 = C018508q.A00();
                    C40431sF.A00();
                    C2Bk A002 = C2Bk.A00();
                    C42351vb A003 = C42351vb.A00();
                    if (C47582Bu.A06 == null) {
                        synchronized (C47582Bu.class) {
                            if (C47582Bu.A06 == null) {
                                C47582Bu.A06 = new C47582Bu(c001200o, C003701t.A00(), AbstractC000600i.A00(), C01B.A00(), C000400f.A00(), C0G4.A00());
                            }
                        }
                    }
                    C47582Bu c47582Bu = C47582Bu.A06;
                    if (C2CC.A01 == null) {
                        synchronized (C2CC.class) {
                            if (C2CC.A01 == null) {
                                C2CC.A01 = new C2CC(C0F2.A00());
                            }
                        }
                    }
                    C2CC c2cc = C2CC.A01;
                    C40401sA A004 = C40401sA.A00();
                    if (C2CD.A01 == null) {
                        synchronized (C2CD.class) {
                            if (C2CD.A01 == null) {
                                C2CD.A01 = new C2CD(C40431sF.A00().A06());
                            }
                        }
                    }
                    A08 = new C47512Bn(c001200o, A00, A002, A003, c47582Bu, c2cc, A004, C2CD.A01);
                }
            }
        }
        return A08;
    }

    public C42531vt A01(String str, String str2) {
        C42531vt c42531vt;
        boolean z;
        List<C0JM> unmodifiableList;
        C04050If A00;
        String str3;
        String str4;
        StringBuilder A0P = C000200d.A0P("ThirdPartyStickerManager/fetchPack/");
        A0P.append(str.hashCode());
        A0P.append("/");
        A0P.append(str2);
        Log.i(A0P.toString());
        C40401sA c40401sA = this.A07;
        if (!c40401sA.A03(str, str2)) {
            Log.i("ThirdPartyStickerManager/fetchPack/not using sticker cache");
            return this.A02.A04(str, str2);
        }
        try {
            C47582Bu c47582Bu = this.A02;
            c42531vt = c47582Bu.A05(str, str2);
            if (c42531vt != null && c42531vt.A0L) {
                Log.i("ThirdPartyStickerManager/fetchPack/avoid caching is true");
                return c47582Bu.A04(str, str2);
            }
        } catch (Exception e) {
            Log.e("ThirdPartyStickerManager/fetchPack/could not fetch pack metadata", e);
            c42531vt = null;
        }
        if (c40401sA != null) {
            AbstractList abstractList = (AbstractList) c40401sA.A01("authority=? AND sticker_pack_id=?", new String[]{str, str2});
            C42531vt c42531vt2 = abstractList.isEmpty() ? null : (C42531vt) abstractList.get(0);
            if (c42531vt != null && (c42531vt2 == null || (str4 = c42531vt2.A02) == null || !str4.equals(c42531vt.A0E))) {
                z = true;
                c40401sA.A02(str, str2, c42531vt);
                Log.i("ThirdPartyStickerManager/fetchPack/repopulate sticker pack db");
                C2CC c2cc = this.A05;
                File A002 = c2cc.A00(c42531vt.A0D);
                if (A002 != null && AnonymousClass024.A0f(A002)) {
                    A002.toString();
                }
                c2cc.A01(C47582Bu.A03(this.A01.A00, c42531vt), c42531vt);
            } else {
                z = false;
                c42531vt = c42531vt2;
            }
            C42351vb c42351vb = this.A04;
            synchronized (c42351vb) {
                try {
                    File A01 = c42351vb.A01(str, str2);
                    if (!A01.exists()) {
                        unmodifiableList = Collections.emptyList();
                    } else {
                        File[] listFiles = A01.listFiles();
                        Arrays.sort(listFiles, C42351vb.A02);
                        ArrayList arrayList = new ArrayList(listFiles.length);
                        String A012 = C47582Bu.A01(str, str2);
                        for (File file : listFiles) {
                            String name = file.getName();
                            String decode = Uri.decode(AnonymousClass024.A0H(name.substring(3)));
                            C0JM c0jm = new C0JM();
                            c0jm.A0B = decode;
                            c0jm.A08 = new File(A01, name).getAbsolutePath();
                            c0jm.A01 = 2;
                            c0jm.A0A = "image/webp";
                            c0jm.A03 = 512;
                            c0jm.A02 = 512;
                            c0jm.A0D = A012;
                            byte[] fetchWebpMetadata = WebpUtils.fetchWebpMetadata(file.getAbsolutePath());
                            if (fetchWebpMetadata != null && (A00 = C04050If.A00(fetchWebpMetadata)) != null) {
                                c0jm.A04 = A00;
                            }
                            arrayList.add(c0jm);
                        }
                        arrayList.size();
                        unmodifiableList = Collections.unmodifiableList(arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (unmodifiableList.isEmpty() || z) {
                unmodifiableList = this.A02.A04(str, str2).A04;
                c42351vb.A02(str, str2, unmodifiableList);
                Log.i("ThirdPartyStickerManager/fetchPack/repopulating sticker cache");
            }
            for (C0JM c0jm2 : unmodifiableList) {
                String str5 = c0jm2.A0B;
                if (str5 != null) {
                    C2CD c2cd = this.A06;
                    if (c2cd != null) {
                        String[] strArr = {"emojis"};
                        String[] strArr2 = {str5};
                        C0CD A02 = c2cd.A00.A02();
                        try {
                            Cursor A09 = A02.A02.A09("third_party_sticker_emoji_mapping", strArr, "plaintext_hash = ?", strArr2, null, "getEmoji/QUERY_EMOJI");
                            if (A09 != null) {
                                if (A09.moveToNext()) {
                                    str3 = A09.getString(A09.getColumnIndex("emojis"));
                                    A09.close();
                                    A02.close();
                                    c0jm2.A06 = str3;
                                } else {
                                    A09.close();
                                }
                            }
                            A02.close();
                            str3 = null;
                            c0jm2.A06 = str3;
                        } finally {
                        }
                    } else {
                        throw null;
                    }
                }
            }
            if (c42531vt != null) {
                c42531vt.A04 = unmodifiableList;
                if (z) {
                    this.A00.A02.post(new RunnableEBaseShape4S0200000_I0_4(this, c42531vt, 28));
                }
                return c42531vt;
            }
            throw null;
        }
        throw null;
    }

    public File A02(String str) {
        Pair A00 = C47582Bu.A00(str);
        if (A00 == null) {
            return null;
        }
        if (this.A07.A03((String) A00.first, (String) A00.second)) {
            C2CC c2cc = this.A05;
            File A002 = c2cc.A00(str);
            if (A002 == null || !A002.exists()) {
                try {
                    C42531vt A04 = this.A02.A04((String) A00.first, (String) A00.second);
                    return c2cc.A01(C47582Bu.A03(this.A01.A00, A04), A04);
                } catch (Exception e) {
                    Log.e("ThirdPartyStickerManager/getTrayIcon/error fetching pack", e);
                    return null;
                }
            }
            return A002;
        }
        return null;
    }
}
