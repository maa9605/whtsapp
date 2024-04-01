package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2AS */
/* loaded from: classes2.dex */
public class C2AS {
    public static volatile C2AS A0T;
    public AnonymousClass241 A00;
    public byte[] A01;
    public final AbstractC000600i A02;
    public final C012005w A03;
    public final C018508q A04;
    public final C0F2 A05;
    public final C01B A06;
    public final C011605s A07;
    public final C000400f A08;
    public final C001200o A09;
    public final C000500h A0A;
    public final C003701t A0B;
    public final C41451tw A0C;
    public final C2AW A0D;
    public final C41571uA A0E;
    public final C41521u3 A0F;
    public final C47502Bm A0G;
    public final C47552Br A0H;
    public final C2Bk A0I;
    public final C47522Bo A0J;
    public final C47532Bp A0K;
    public final AnonymousClass264 A0L;
    public final C47512Bn A0M;
    public final C47492Bl A0N;
    public final C2AP A0O;
    public final C40431sF A0P;
    public final C40401sA A0Q;
    public final C47542Bq A0R;
    public final InterfaceC002901k A0S;

    public C2AS(C001200o c001200o, C011605s c011605s, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C012005w c012005w, C01B c01b, C41521u3 c41521u3, C2AP c2ap, C40431sF c40431sF, C2Bk c2Bk, C000400f c000400f, C41571uA c41571uA, C41451tw c41451tw, C000500h c000500h, C47492Bl c47492Bl, C47502Bm c47502Bm, C2AW c2aw, C47512Bn c47512Bn, C47522Bo c47522Bo, C47532Bp c47532Bp, C47542Bq c47542Bq, C0F2 c0f2, C47552Br c47552Br, AnonymousClass264 anonymousClass264, C40401sA c40401sA) {
        this.A09 = c001200o;
        this.A07 = c011605s;
        this.A0B = c003701t;
        this.A04 = c018508q;
        this.A02 = abstractC000600i;
        this.A0S = interfaceC002901k;
        this.A03 = c012005w;
        this.A06 = c01b;
        this.A0F = c41521u3;
        this.A0O = c2ap;
        this.A08 = c000400f;
        this.A0I = c2Bk;
        this.A0E = c41571uA;
        this.A0C = c41451tw;
        this.A0A = c000500h;
        this.A0N = c47492Bl;
        this.A0D = c2aw;
        this.A0M = c47512Bn;
        this.A0J = c47522Bo;
        this.A0R = c47542Bq;
        this.A05 = c0f2;
        this.A0L = anonymousClass264;
        this.A0P = c40431sF;
        this.A0K = c47532Bp;
        this.A0H = c47552Br;
        this.A0G = c47502Bm;
        this.A0Q = c40401sA;
    }

    public static C2AS A00() {
        if (A0T == null) {
            synchronized (C2AS.class) {
                if (A0T == null) {
                    C001200o c001200o = C001200o.A01;
                    C011605s A00 = C011605s.A00();
                    C003701t A002 = C003701t.A00();
                    C018508q A003 = C018508q.A00();
                    AbstractC000600i A004 = AbstractC000600i.A00();
                    InterfaceC002901k A005 = C002801j.A00();
                    C012005w A006 = C012005w.A00();
                    C01B A007 = C01B.A00();
                    C41521u3 A008 = C41521u3.A00();
                    C2AP A009 = C2AP.A00();
                    C40431sF A0010 = C40431sF.A00();
                    C2Bk A0011 = C2Bk.A00();
                    C000400f A0012 = C000400f.A00();
                    C41571uA A0013 = C41571uA.A00();
                    C41451tw A0014 = C41451tw.A00();
                    C000500h A0015 = C000500h.A00();
                    C47492Bl A0016 = C47492Bl.A00();
                    if (C47502Bm.A02 == null) {
                        synchronized (C47502Bm.class) {
                            if (C47502Bm.A02 == null) {
                                C47502Bm.A02 = new C47502Bm(C0EL.A00(), C41451tw.A00());
                            }
                        }
                    }
                    C47502Bm c47502Bm = C47502Bm.A02;
                    C2AW A0017 = C2AW.A00();
                    C47512Bn A0018 = C47512Bn.A00();
                    C47522Bo A0019 = C47522Bo.A00();
                    C47532Bp A0020 = C47532Bp.A00();
                    if (C47542Bq.A01 == null) {
                        synchronized (C47542Bq.class) {
                            if (C47542Bq.A01 == null) {
                                C47542Bq.A01 = new C47542Bq(C40431sF.A00());
                            }
                        }
                    }
                    A0T = new C2AS(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, c47502Bm, A0017, A0018, A0019, A0020, C47542Bq.A01, C0F2.A00(), C47552Br.A00(), AnonymousClass264.A00(), C40401sA.A00());
                }
            }
        }
        return A0T;
    }

    public static final void A01(C2AW c2aw, C42531vt c42531vt) {
        for (C0JM c0jm : c42531vt.A04) {
            c2aw.A02(c0jm.A0B);
        }
        c2aw.A02(c42531vt.A0D);
    }

    public Pair A02(C0JM c0jm) {
        String str;
        if (c0jm.A0B != null) {
            String str2 = null;
            try {
                File A01 = this.A08.A04.A01(AnonymousClass024.A0I(Base64.encodeToString(C02A.A0C(32), 2)));
                if (c0jm.A01 != 3 && (str = c0jm.A08) != null) {
                    try {
                        AnonymousClass024.A0P(this.A03.A04, new File(str), A01);
                        if (A01.exists()) {
                            return new Pair(A01, c0jm.A0B);
                        }
                    } catch (IOException e) {
                        Log.e("StickerRepository/moveThirdPartyStickerToTempStorage failed to copy cached file", e);
                        return null;
                    }
                }
                try {
                    InputStream openInputStream = this.A09.A00.getContentResolver().openInputStream(Uri.parse(c0jm.A08));
                    boolean A0i = openInputStream != null ? AnonymousClass024.A0i(openInputStream, A01) : false;
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    if (A0i) {
                        try {
                            C40731sm.A0k(A01, this.A0B, this.A06, null, null);
                            C04050If c04050If = c0jm.A04;
                            if (c04050If != null && !WebpUtils.A01(A01, c04050If.A01())) {
                                Log.e("StickerRepository/moveThirdPartyStickerToTempStorage failed to insert metadata");
                                AnonymousClass024.A0f(A01);
                                return null;
                            }
                            try {
                                str2 = C40841sx.A0I(A01);
                            } catch (IOException e2) {
                                C000200d.A12("StickerRepository/moveThirdPartyStickerToTempStorage could not get file hash; file=", A01, e2);
                            }
                        } catch (C47562Bs e3) {
                            Log.e("StickerRepository/moveThirdPartyStickerToTempStorage sticker file failed validation", e3);
                            AnonymousClass024.A0f(A01);
                            return null;
                        }
                    }
                    return new Pair(A01, str2);
                } catch (IOException e4) {
                    Log.e("StickerRepository/moveThirdPartyStickerToTempStorage failed to copy external file", e4);
                    AnonymousClass024.A0f(A01);
                    return null;
                }
            } catch (IOException e5) {
                Log.e("StickerRepository/moveThirdPartyStickerToTempStorage failed to generate internal temp file", e5);
                return null;
            }
        }
        throw null;
    }

    public C42531vt A03(String str, boolean z, AnonymousClass263 anonymousClass263) {
        C42531vt A01;
        C40431sF c40431sF = this.A0P;
        C42531vt A02 = c40431sF.A02(str);
        if (A02 == null) {
            A02 = c40431sF.A01(str);
        }
        if (z && A02 == null && !str.contains(" ")) {
            this.A0L.A01();
            A02 = c40431sF.A01(str);
            if (A02 == null) {
                return this.A0K.A01(str, anonymousClass263);
            }
        }
        if (A02 == null) {
            if (str.contains(" ")) {
                try {
                    Pair A00 = C47582Bu.A00(str);
                    if (A00 != null && this.A0Q.A03((String) A00.first, (String) A00.second)) {
                        A02 = this.A0M.A01((String) A00.first, (String) A00.second);
                        if (A02 != null) {
                        }
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("StickerRepository/getStickerPackByIdSync/error fetching sticker pack: ");
                    sb.append(str);
                    Log.e(sb.toString(), e);
                    return null;
                }
            }
            return A02;
        } else if ((A02.A02 == null || A02.A01()) && (A01 = this.A0K.A01(A02.A0D, null)) != null) {
            A02.A03 = A01.A03;
            A02.A04 = A01.A04;
        }
        C000700j.A00();
        A02.A00 = c40431sF.A05().A00(str);
        return A02;
    }

    public AnonymousClass241 A04() {
        AnonymousClass241 anonymousClass241 = this.A00;
        if (anonymousClass241 == null) {
            C001200o c001200o = this.A09;
            File file = new File(c001200o.A00.getCacheDir(), "stickers_preview_images");
            if (!file.exists() && !file.mkdirs()) {
                StringBuilder A0P = C000200d.A0P("StickerRepository/getPreviewImageLoader/could not create diskcache directory:");
                A0P.append(file.getAbsolutePath());
                Log.w(A0P.toString());
            }
            AnonymousClass242 anonymousClass242 = new AnonymousClass242(this.A04, this.A0C, file);
            anonymousClass242.A01 = Integer.MAX_VALUE;
            anonymousClass242.A02 = Math.min(4194304L, file.getFreeSpace() / 16);
            anonymousClass242.A04 = C02160Ac.A03(c001200o.A00, R.drawable.sticker_store_error);
            anonymousClass242.A03 = C02160Ac.A03(c001200o.A00, R.drawable.sticker_store_error);
            anonymousClass242.A05 = true;
            AnonymousClass241 A00 = anonymousClass242.A00();
            this.A00 = A00;
            return A00;
        }
        return anonymousClass241;
    }

    public File A05(C0JM c0jm) {
        Pair A02;
        Object obj;
        Object obj2;
        String str = c0jm.A0B;
        if (str != null) {
            C0F2 c0f2 = this.A05;
            File A04 = c0f2.A04(str);
            if (A04 == null && (A02 = A02(c0jm)) != null && (obj = A02.first) != null && (obj2 = A02.second) != null) {
                try {
                    A04 = A07((File) obj, (String) obj2);
                    c0f2.A04((String) A02.second);
                    return A04;
                } catch (IOException unused) {
                    StringBuilder A0P = C000200d.A0P("StickerRepository/incrementReferenceCountOnThirdPartySticker unable to move ");
                    A0P.append(((File) A02.first).getAbsolutePath());
                    A0P.append(" to internal storage");
                    Log.e(A0P.toString());
                }
            }
            return A04;
        }
        throw null;
    }

    public File A06(C0JM c0jm, File file) {
        File A01 = this.A0H.A01(c0jm, file);
        if (A01 != null) {
            c0jm.A08 = A01.getAbsolutePath();
            c0jm.A01 = 1;
            c0jm.A04 = C04050If.A00(WebpUtils.fetchWebpMetadata(A01.getAbsolutePath()));
            StringBuilder A0P = C000200d.A0P("StickerRepository/downloadSticker/downloaded sticker, file_hash:");
            A0P.append(c0jm.A0B);
            A0P.append(",media_key:");
            A0P.append(c0jm.A09);
            A0P.append(",file:");
            A0P.append(A01.getAbsolutePath());
            A0P.append(", direct_path:");
            C000200d.A1N(A0P, c0jm.A05);
            return A01;
        }
        C000200d.A1M(C000200d.A0P("StickerRepository/downloadSticker/sticker file is null for: "), c0jm.A0B);
        return A01;
    }

    public final File A07(File file, String str) {
        File A05 = this.A05.A05(str);
        try {
            AnonymousClass024.A0Q(this.A03.A04, file, A05);
            return A05;
        } catch (IOException e) {
            Log.e("StickerRepository/moveTempStickerFileToInternalStorage failed to copy resulting file");
            AnonymousClass024.A0f(file);
            throw e;
        }
    }

    public final File A08(String str) {
        File A03 = this.A05.A03();
        if (A03.exists() || A03.mkdirs()) {
            return new File(A03, C000200d.A0H(str, ".png"));
        }
        return null;
    }

    public String A09(C42531vt c42531vt) {
        String str = c42531vt.A0D;
        File A08 = A08(str);
        if (A08 == null || !A08.exists()) {
            A08 = this.A0M.A02(str);
        }
        if (A08 != null && A08.exists()) {
            FileInputStream fileInputStream = new FileInputStream(A08);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                C40841sx.A0d(fileInputStream, messageDigest);
                return Base64.encodeToString(messageDigest.digest(), 2);
            } finally {
            }
        } else {
            throw new IOException("StickerRepository/calculateThirdPartyTrayFileHash/cannot fetch third party tray");
        }
    }

    public String A0A(List list) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C42531vt c42531vt = (C42531vt) it.next();
                String str = c42531vt.A02;
                if (str != null) {
                    messageDigest.update(str.getBytes());
                } else if (c42531vt.A0N) {
                    StringBuilder A0P = C000200d.A0P("StickerRepository/calculateImageDataHashForThirdParty, id: ");
                    String str2 = c42531vt.A0D;
                    C000200d.A1N(A0P, str2);
                    String str3 = c42531vt.A0E;
                    if (str3 == null) {
                        MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                        Iterator it2 = c42531vt.A04.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String str4 = ((C0JM) it2.next()).A0B;
                            if (str4 == null) {
                                this.A02.A09("third party sticker plaintext hash is null", null, true);
                                messageDigest2.update(str2.getBytes());
                                break;
                            }
                            messageDigest2.update(str4.getBytes());
                        }
                        String A09 = A09(c42531vt);
                        if (A09 != null) {
                            messageDigest2.update(A09.getBytes());
                        }
                        str3 = AnonymousClass024.A0I(Base64.encodeToString(messageDigest2.digest(), 2));
                    }
                    messageDigest.update(str3.getBytes());
                }
            }
            return AnonymousClass024.A0I(Base64.encodeToString(messageDigest.digest(), 2));
        } catch (IOException | NoSuchAlgorithmException e) {
            Log.e("app/xmpp/recv/handle_sticker_pack_query/could not get MD5 message digest", e);
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                if (((C42531vt) list.get(i)).A02 != null) {
                    strArr[i] = ((C42531vt) list.get(i)).A02;
                } else {
                    strArr[i] = ((C42531vt) list.get(i)).A0D;
                }
            }
            return String.valueOf(Arrays.hashCode(strArr));
        }
    }

    public List A0B() {
        List A01 = this.A0Q.A01(null, null);
        Set A00 = this.A0R.A00();
        ArrayList arrayList = (ArrayList) A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42531vt c42531vt = (C42531vt) it.next();
            C40431sF c40431sF = this.A0P;
            String str = c42531vt.A0D;
            C000700j.A00();
            c42531vt.A00 = c40431sF.A05().A00(str);
            c42531vt.A07 = ((AbstractCollection) A00).contains(str);
        }
        C000200d.A1W(arrayList, C000200d.A0P("StickerRepository/getCachedWhiteListedStickerPacksSync/found total cached sticker pack count: "));
        return A01;
    }

    public List A0C() {
        C011605s c011605s = this.A07;
        List A07 = c011605s.A07();
        if (A07 != null) {
            return A07;
        }
        C40431sF c40431sF = this.A0P;
        if (c40431sF != null) {
            C000700j.A00();
            List A00 = c40431sF.A04().A00(null);
            HashSet hashSet = new HashSet();
            Set A002 = this.A0R.A00();
            ArrayList arrayList = (ArrayList) A00;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C42531vt c42531vt = (C42531vt) it.next();
                String str = c42531vt.A0D;
                if (hashSet.contains(str)) {
                    Log.e("StickerRepository/getInstalledFirstPartyStickerPacksSync duplicate sticker pack");
                } else {
                    hashSet.add(str);
                    if (c40431sF != null) {
                        C000700j.A00();
                        List A003 = c40431sF.A03().A00(str);
                        Iterator it2 = ((AbstractCollection) A003).iterator();
                        while (it2.hasNext()) {
                            C0JM c0jm = (C0JM) it2.next();
                            if (!TextUtils.isEmpty(c0jm.A08)) {
                                c0jm.A04 = C04050If.A00(WebpUtils.fetchWebpMetadata(c0jm.A08));
                            }
                        }
                        c42531vt.A04 = A003;
                        c42531vt.A07 = ((AbstractCollection) A002).contains(str);
                        for (C0JM c0jm2 : c42531vt.A04) {
                            A0G(c0jm2);
                        }
                    } else {
                        throw null;
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C42531vt c42531vt2 = (C42531vt) it3.next();
                String str2 = c42531vt2.A0D;
                C000700j.A00();
                c42531vt2.A00 = c40431sF.A05().A00(str2);
            }
            Collections.sort(A00, new C47592Bv(false));
            C000200d.A1W(arrayList, new StringBuilder("StickerRepository/getInstalledFirstPartyStickerPacksSync/found total sticker pack count: "));
            c011605s.A0B(A00);
            return A00;
        }
        throw null;
    }

    public List A0D() {
        C40431sF c40431sF = this.A0P;
        if (c40431sF != null) {
            C000700j.A00();
            List A00 = c40431sF.A04().A00(null);
            AbstractCollection abstractCollection = (AbstractCollection) A00;
            abstractCollection.addAll(A0B());
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                C42531vt c42531vt = (C42531vt) it.next();
                String str = c42531vt.A0D;
                C000700j.A00();
                c42531vt.A00 = c40431sF.A05().A00(str);
            }
            Collections.sort(A00, new C47592Bv(false));
            return A00;
        }
        throw null;
    }

    public List A0E() {
        C2AP c2ap = this.A0O;
        if (c2ap != null) {
            C000700j.A00();
            List A00 = c2ap.A02.A00();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((AbstractCollection) A00).iterator();
            while (it.hasNext()) {
                C47612Bx c47612Bx = (C47612Bx) it.next();
                C0F2 c0f2 = this.A05;
                String str = c47612Bx.A09;
                File A05 = c0f2.A05(str);
                if (A05.exists()) {
                    C0JM c0jm = new C0JM();
                    c0jm.A08 = A05.getAbsolutePath();
                    c0jm.A01 = 1;
                    c0jm.A0B = str;
                    c0jm.A0E = c47612Bx.A0C;
                    c0jm.A07 = c47612Bx.A08;
                    c0jm.A05 = c47612Bx.A07;
                    String str2 = c47612Bx.A0B;
                    if (str2 != null) {
                        c0jm.A0A = str2;
                    } else {
                        c0jm.A0A = "image/webp";
                    }
                    c0jm.A09 = c47612Bx.A0A;
                    c0jm.A00 = c47612Bx.A03;
                    c0jm.A03 = c47612Bx.A05;
                    c0jm.A02 = c47612Bx.A04;
                    c0jm.A04 = C04050If.A00(WebpUtils.fetchWebpMetadata(A05.getAbsolutePath()));
                    A0G(c0jm);
                    arrayList.add(c0jm);
                }
            }
            return arrayList;
        }
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.1vt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List A0F(X.C47622By r14) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2AS.A0F(X.2By):java.util.List");
    }

    public final void A0G(C0JM c0jm) {
        String str;
        byte[] bArr;
        String str2 = c0jm.A0B;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            synchronized (this) {
                if (this.A01 == null) {
                    C000500h c000500h = this.A0A;
                    String string = c000500h.A00.getString("sticker_hash_salt", null);
                    if (string == null) {
                        byte[] A0C = C02A.A0C(32);
                        this.A01 = A0C;
                        c000500h.A0D().putString("sticker_hash_salt", Base64.encodeToString(A0C, 2)).apply();
                    } else {
                        this.A01 = Base64.decode(string, 0);
                    }
                }
                bArr = this.A01;
            }
            messageDigest.update(bArr);
            messageDigest.update(str2.getBytes());
            str = Base64.encodeToString(messageDigest.digest(), 2);
        } catch (NoSuchAlgorithmException unused) {
            str = null;
        }
        c0jm.A0C = str;
    }

    public final void A0H(C42531vt c42531vt) {
        C0CD A03 = this.A0R.A00.A06().A03();
        try {
            A03.A02.A01("unseen_sticker_packs", "pack_id = ?", new String[]{c42531vt.A0D});
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A0I(C42531vt c42531vt, C82493qb c82493qb) {
        String str = c42531vt.A0D;
        C47522Bo c47522Bo = this.A0J;
        Map map = c47522Bo.A01;
        if (map.containsKey(str)) {
            Log.e("StickerRepository/downloadStickersOfAStickerPackAsync attempting to download same pack twice");
            return;
        }
        C2Bk c2Bk = this.A0I;
        C0HS c0hs = new C0HS(c2Bk, this, c47522Bo, str, c82493qb) { // from class: X.2C4
            public final C82493qb A00;
            public final C2Bk A01;
            public final C47522Bo A02;
            public final C2AS A03;
            public final String A04;

            {
                this.A01 = c2Bk;
                this.A03 = this;
                this.A02 = c47522Bo;
                this.A04 = str;
                this.A00 = c82493qb;
            }

            @Override // X.C0HS
            public void A01(Object obj) {
                A0A((C3Y0) obj);
            }

            @Override // X.C0HS
            public void A03(Object... objArr) {
                int intValue = ((Number) objArr[1]).intValue();
                C47522Bo c47522Bo2 = this.A02;
                String str2 = this.A04;
                c47522Bo2.A01.put(str2, Integer.valueOf(intValue));
                this.A01.A03(str2, intValue);
            }

            /* JADX WARN: Code restructure failed: missing block: B:197:0x00fa, code lost:
                if (r6 == false) goto L21;
             */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object A07(java.lang.Object[] r21) {
                /*
                    Method dump skipped, instructions count: 792
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2C4.A07(java.lang.Object[]):java.lang.Object");
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                C3Y0 c3y0 = (C3Y0) obj;
                if (c3y0 != null) {
                    A0A(c3y0);
                    return;
                }
                throw null;
            }

            public final void A0A(C3Y0 c3y0) {
                C42531vt c42531vt2;
                if (c3y0.A02 != null && (c42531vt2 = c3y0.A00) != null) {
                    C2Bk c2Bk2 = this.A01;
                    if (c2Bk2 != null) {
                        C000700j.A01();
                        Iterator it = ((AnonymousClass009) c2Bk2).A00.iterator();
                        while (true) {
                            C0G5 c0g5 = (C0G5) it;
                            if (!c0g5.hasNext()) {
                                break;
                            }
                            C25R c25r = (C25R) c0g5.next();
                            if (c25r instanceof C25S) {
                                C461225a c461225a = ((C25S) c25r).A00;
                                HashMap hashMap = c461225a.A0D;
                                String str2 = c42531vt2.A0D;
                                hashMap.remove(str2);
                                c461225a.A0E.remove(str2);
                                if (c461225a.A04 != null) {
                                    int i = 0;
                                    while (true) {
                                        if (i < c461225a.A04.size()) {
                                            if (((C42531vt) c461225a.A04.get(i)).A0D.equals(str2)) {
                                                c461225a.A04.set(i, c42531vt2);
                                                break;
                                            }
                                            i++;
                                        } else {
                                            c461225a.A04.add(c42531vt2);
                                            Collections.sort(c461225a.A04, new C47592Bv(false));
                                            break;
                                        }
                                    }
                                    c461225a.A04(c461225a.A04, null);
                                } else {
                                    c461225a.A03();
                                }
                                if (c461225a.A00 != null) {
                                    c461225a.A02();
                                }
                            } else if (c25r instanceof C25T) {
                                StickerStoreTabFragment stickerStoreTabFragment = ((C25T) c25r).A00;
                                if (!(stickerStoreTabFragment instanceof StickerStoreMyTabFragment)) {
                                    if ((stickerStoreTabFragment instanceof StickerStoreFeaturedTabFragment) && stickerStoreTabFragment.A0B != null) {
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= stickerStoreTabFragment.A0B.size()) {
                                                break;
                                            } else if (((C42531vt) stickerStoreTabFragment.A0B.get(i2)).A0D.equals(c42531vt2.A0D)) {
                                                stickerStoreTabFragment.A0B.set(i2, c42531vt2);
                                                C2C7 c2c7 = stickerStoreTabFragment.A0A;
                                                if (c2c7 != null) {
                                                    c2c7.A02(i2);
                                                }
                                            } else {
                                                i2++;
                                            }
                                        }
                                    }
                                } else {
                                    StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) stickerStoreTabFragment;
                                    if (((StickerStoreTabFragment) stickerStoreMyTabFragment).A0A != null) {
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 < ((StickerStoreTabFragment) stickerStoreMyTabFragment).A0B.size()) {
                                                if (((C42531vt) ((StickerStoreTabFragment) stickerStoreMyTabFragment).A0B.get(i3)).A0D.equals(c42531vt2.A0D)) {
                                                    ((StickerStoreTabFragment) stickerStoreMyTabFragment).A0B.set(i3, c42531vt2);
                                                    C2C7 c2c72 = ((StickerStoreTabFragment) stickerStoreMyTabFragment).A0A;
                                                    if (c2c72 != null) {
                                                        c2c72.A02(i3);
                                                    }
                                                } else {
                                                    i3++;
                                                }
                                            } else {
                                                C2C7 c2c73 = ((StickerStoreTabFragment) stickerStoreMyTabFragment).A0A;
                                                if (!(c2c73 instanceof C86453xX)) {
                                                    c2c73.A00.add(c42531vt2);
                                                    c2c73.A03(c2c73.A00.indexOf(c42531vt2));
                                                    c2c73.A01.A0y();
                                                } else {
                                                    C86453xX c86453xX = (C86453xX) c2c73;
                                                    ((C2C7) c86453xX).A00.add(0, c42531vt2);
                                                    c86453xX.A03(((C2C7) c86453xX).A00.indexOf(c42531vt2));
                                                    c86453xX.A00.A0y();
                                                }
                                                stickerStoreMyTabFragment.A04 = true;
                                            }
                                        }
                                    }
                                }
                            } else if (!(c25r instanceof C2IN)) {
                                if (c25r instanceof C2IO) {
                                    C2IP c2ip = ((C2IO) c25r).A00;
                                    List A00 = C2IP.A00(c2ip, c42531vt2);
                                    Map map2 = c2ip.A0i;
                                    String str3 = c42531vt2.A0D;
                                    map2.put(str3, c42531vt2);
                                    c2ip.A0W.A02(A00);
                                    c2ip.A0j.put(str3, A00);
                                    C2IP.A01(c2ip, A00);
                                    C2IQ c2iq = c2ip.A0Z;
                                    LinkedHashMap linkedHashMap = c2iq.A04;
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    c2iq.A04 = linkedHashMap2;
                                    linkedHashMap2.put(str3, c2iq.A0H(c42531vt2));
                                    c2iq.A04.putAll(linkedHashMap);
                                    c2iq.A0J();
                                    ((AbstractC04890Mh) c2iq).A01.A04(c2iq.A05.size(), c2iq.A0C() - c2iq.A05.size(), null);
                                    c2iq.A0K();
                                }
                            } else {
                                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = ((C2IN) c25r).A00;
                                C42531vt c42531vt3 = stickerStorePackPreviewActivity.A0J.A02;
                                if (c42531vt3 != null && c42531vt3.A0D.equals(c42531vt2.A0D)) {
                                    StickerStorePackPreviewActivity.A01(stickerStorePackPreviewActivity, c42531vt2);
                                    stickerStorePackPreviewActivity.setResult(1);
                                    ((ActivityC02290Ap) stickerStorePackPreviewActivity).A0A.A07(R.string.sticker_pack_download_successfully, 1);
                                    if (!stickerStorePackPreviewActivity.A0U) {
                                        stickerStorePackPreviewActivity.finish();
                                    }
                                }
                            }
                        }
                    } else {
                        throw null;
                    }
                } else if (c3y0.A01 != null) {
                    C2Bk c2Bk3 = this.A01;
                    String str4 = this.A04;
                    if (c2Bk3 != null) {
                        C000700j.A01();
                        Iterator it2 = ((AnonymousClass009) c2Bk3).A00.iterator();
                        while (true) {
                            C0G5 c0g52 = (C0G5) it2;
                            if (!c0g52.hasNext()) {
                                break;
                            }
                            C25R c25r2 = (C25R) c0g52.next();
                            if (c25r2 instanceof C25S) {
                                C461225a c461225a2 = ((C25S) c25r2).A00;
                                c461225a2.A0D.remove(str4);
                                c461225a2.A0E.remove(str4);
                                List list = c461225a2.A04;
                                if (list != null) {
                                    c461225a2.A04(list, null);
                                }
                            } else if (!(c25r2 instanceof C25T)) {
                                if (c25r2 instanceof C2IN) {
                                    StickerStorePackPreviewActivity stickerStorePackPreviewActivity2 = ((C2IN) c25r2).A00;
                                    C42531vt c42531vt4 = stickerStorePackPreviewActivity2.A0J.A02;
                                    if (c42531vt4 != null && str4.equals(c42531vt4.A0D)) {
                                        c42531vt4.A05 = false;
                                        stickerStorePackPreviewActivity2.A1Q();
                                        ((ActivityC02290Ap) stickerStorePackPreviewActivity2).A0A.A0E(stickerStorePackPreviewActivity2.getString(R.string.sticker_store_download_failed, c42531vt4.A0F), 1);
                                    }
                                }
                            } else {
                                StickerStoreTabFragment stickerStoreTabFragment2 = ((C25T) c25r2).A00;
                                if (!(stickerStoreTabFragment2 instanceof StickerStoreMyTabFragment)) {
                                    if ((stickerStoreTabFragment2 instanceof StickerStoreFeaturedTabFragment) && stickerStoreTabFragment2.A0B != null) {
                                        for (int i4 = 0; i4 < stickerStoreTabFragment2.A0B.size(); i4++) {
                                            C42531vt c42531vt5 = (C42531vt) stickerStoreTabFragment2.A0B.get(i4);
                                            if (c42531vt5.A0D.equals(str4)) {
                                                c42531vt5.A05 = false;
                                                C2C7 c2c74 = stickerStoreTabFragment2.A0A;
                                                if (c2c74 != null) {
                                                    c2c74.A02(i4);
                                                }
                                                stickerStoreTabFragment2.A05.A0E(stickerStoreTabFragment2.A0G(R.string.sticker_store_download_failed, c42531vt5.A0F), 1);
                                            }
                                        }
                                    }
                                } else if (stickerStoreTabFragment2.A0B != null) {
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < stickerStoreTabFragment2.A0B.size()) {
                                            C42531vt c42531vt6 = (C42531vt) stickerStoreTabFragment2.A0B.get(i5);
                                            if (c42531vt6.A0D.equals(str4)) {
                                                c42531vt6.A05 = false;
                                                C2C7 c2c75 = stickerStoreTabFragment2.A0A;
                                                if (c2c75 != null) {
                                                    c2c75.A02(i5);
                                                }
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
                C47522Bo c47522Bo2 = this.A02;
                String str5 = this.A04;
                c47522Bo2.A01.remove(str5);
                c47522Bo2.A00.remove(str5);
                C82493qb c82493qb2 = this.A00;
                if (c82493qb2 != null) {
                    Runnable runnable = c82493qb2.A00;
                    if (c3y0.A03 && runnable != null) {
                        runnable.run();
                    }
                }
            }
        };
        map.put(str, 0);
        c47522Bo.A00.put(str, c0hs);
        if (c2Bk != null) {
            C000700j.A01();
            Iterator it = ((AnonymousClass009) c2Bk).A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    C25R c25r = (C25R) c0g5.next();
                    if (!(c25r instanceof C25S)) {
                        if (c25r instanceof C25T) {
                            StickerStoreTabFragment stickerStoreTabFragment = ((C25T) c25r).A00;
                            if (!(stickerStoreTabFragment instanceof StickerStoreMyTabFragment)) {
                                if ((stickerStoreTabFragment instanceof StickerStoreFeaturedTabFragment) && stickerStoreTabFragment.A0B != null) {
                                    for (int i = 0; i < stickerStoreTabFragment.A0B.size(); i++) {
                                        C42531vt c42531vt2 = (C42531vt) stickerStoreTabFragment.A0B.get(i);
                                        if (c42531vt2.A0D.equals(c42531vt.A0D)) {
                                            c42531vt2.A05 = true;
                                            C2C7 c2c7 = stickerStoreTabFragment.A0A;
                                            if (c2c7 != null) {
                                                c2c7.A02(i);
                                            }
                                        }
                                    }
                                }
                            } else if (stickerStoreTabFragment.A0B != null) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < stickerStoreTabFragment.A0B.size()) {
                                        C42531vt c42531vt3 = (C42531vt) stickerStoreTabFragment.A0B.get(i2);
                                        if (c42531vt3.A0D.equals(c42531vt.A0D)) {
                                            c42531vt3.A05 = true;
                                            C2C7 c2c72 = stickerStoreTabFragment.A0A;
                                            if (c2c72 != null) {
                                                c2c72.A02(i2);
                                            }
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        C461225a c461225a = ((C25S) c25r).A00;
                        c461225a.A0E.put(c42531vt.A0D, c42531vt);
                        List list = c461225a.A04;
                        if (list != null) {
                            c461225a.A04(list, null);
                        }
                    }
                } else {
                    this.A0S.ARy(c0hs, c42531vt);
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    public void A0J(C42531vt c42531vt, C2C8 c2c8) {
        this.A0S.ARy(new C0HS(this, c2c8) { // from class: X.2C9
            public final C2AS A00;
            public final C2C8 A01;

            {
                this.A00 = this;
                this.A01 = c2c8;
            }

            @Override // X.C0HS
            public void A03(Object[] objArr) {
                this.A01.ALK(((Bitmap[]) objArr)[0]);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                C42531vt[] c42531vtArr = (C42531vt[]) objArr;
                if (c42531vtArr != null) {
                    C2AS c2as = this.A00;
                    C42531vt c42531vt2 = c42531vtArr[0];
                    if (c2as != null) {
                        C000700j.A00();
                        if (!c42531vt2.A0N) {
                            String str = c42531vt2.A0D;
                            C000700j.A00();
                            File A08 = c2as.A08(str);
                            if (A08 == null || !A08.exists()) {
                                return null;
                            }
                            return BitmapFactory.decodeFile(A08.getAbsolutePath());
                        }
                        File A02 = c2as.A0M.A02(c42531vt2.A0D);
                        if (A02 == null || !A02.exists()) {
                            return null;
                        }
                        return BitmapFactory.decodeFile(A02.getAbsolutePath());
                    }
                    throw null;
                }
                throw null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    this.A01.ALR();
                } else {
                    this.A01.ALW(bitmap);
                }
            }
        }, c42531vt);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0006 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0K(java.util.Collection r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2AS.A0K(java.util.Collection, boolean):void");
    }

    public final void A0L(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0JM c0jm = (C0JM) it.next();
            if (c0jm.A08 != null) {
                this.A05.A09(c0jm.A0B);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final boolean A0M(String str, String str2) {
        try {
            A01(this.A0D, this.A0M.A01(str, str2));
        } catch (Exception e) {
            Log.e("StickerRepository/uninstallThirdPartyPack/fetch pack failed", e);
        }
        C47512Bn c47512Bn = this.A0M;
        File A00 = c47512Bn.A05.A00(C47582Bu.A01(str, str2));
        if (A00 != null && AnonymousClass024.A0f(A00)) {
            A00.toString();
        }
        C42351vb c42351vb = c47512Bn.A04;
        synchronized (c42351vb) {
            File A01 = c42351vb.A01(str, str2);
            if (A01.exists()) {
                File parentFile = A01.getParentFile();
                AnonymousClass024.A0S(A01);
                if (parentFile != null && parentFile.isDirectory() && parentFile.listFiles().length == 0) {
                    AnonymousClass024.A0f(parentFile);
                }
            }
        }
        C2CD c2cd = c47512Bn.A06;
        if (c2cd != null) {
            String[] strArr = {str, str2};
            C0CD A03 = c2cd.A00.A03();
            try {
                A03.A02.A01("third_party_sticker_emoji_mapping", "authority = ? AND sticker_pack_id = ?", strArr);
                A03.close();
                C0CD A032 = c47512Bn.A07.A00.A06().A03();
                try {
                    boolean z = A032.A02.A01("third_party_whitelist_packs", "authority = ? AND sticker_pack_id = ?", new String[]{str, str2}) > 0;
                    A032.close();
                    this.A0F.A0G(A0A(A0D()), C47582Bu.A01(str, str2));
                    return z;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A03.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        } else {
            throw null;
        }
    }
}
