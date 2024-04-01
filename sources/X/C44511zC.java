package X;

import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.1zC */
/* loaded from: classes2.dex */
public class C44511zC {
    public static final C07E A0F;
    public static final String[] A0G;
    public final AbstractC000600i A00;
    public final C01B A01;
    public final C44451z6 A02;
    public final C44521zD A03;
    public final C44331yt A04;
    public final C42961wc A05;
    public final C44371yx A06;
    public final C44311yr A07;
    public final C44321ys A08;
    public final AnonymousClass012 A09;
    public final C1z2 A0A;
    public final C41711uO A0B;
    public final C44401z0 A0C;
    public final C44351yv A0D;
    public final C0G8 A0E;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(400, 64);
        hashMap.put(404, 65);
        hashMap.put(405, 66);
        hashMap.put(406, 67);
        A0F = new C07E(hashMap, null);
        A0G = new String[0];
    }

    public C44511zC(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C01B c01b, C44311yr c44311yr, C44321ys c44321ys, C44331yt c44331yt, C44351yv c44351yv, C44371yx c44371yx, C44401z0 c44401z0, C41711uO c41711uO, C1z2 c1z2, C42961wc c42961wc, C44451z6 c44451z6, C0G8 c0g8, C44521zD c44521zD) {
        this.A09 = anonymousClass012;
        this.A00 = abstractC000600i;
        this.A01 = c01b;
        this.A07 = c44311yr;
        this.A08 = c44321ys;
        this.A04 = c44331yt;
        this.A0D = c44351yv;
        this.A06 = c44371yx;
        this.A0C = c44401z0;
        this.A0B = c41711uO;
        this.A0A = c1z2;
        this.A05 = c42961wc;
        this.A02 = c44451z6;
        this.A0E = c0g8;
        this.A03 = c44521zD;
    }

    public final void A00() {
        this.A0E.A02();
        C44521zD c44521zD = this.A03;
        if (c44521zD != null) {
            Log.i("sync-manager/onFailed");
            C41541u6 c41541u6 = c44521zD.A01;
            C41541u6.A01(c41541u6, false);
            if (c41541u6.A0X()) {
                c44521zD.A00.A02();
                return;
            }
            return;
        }
        throw null;
    }

    public void A01(int i) {
        C0G5 c0g5;
        StringBuilder A0P = C000200d.A0P("sync-response-handler/fatalFailure reason:");
        Integer valueOf = Integer.valueOf(i);
        C000200d.A1M(A0P, valueOf == null ? null : valueOf.toString());
        this.A04.A02(i);
        this.A0E.A02();
        this.A05.A02().remove("first_transient_server_failure_timestamp").apply();
        C44521zD c44521zD = this.A03;
        if (c44521zD != null) {
            Log.i("sync-manager/onFatalFailure");
            c44521zD.A00.A02();
            C41541u6.A01(c44521zD.A01, false);
            C44361yw c44361yw = c44521zD.A03;
            synchronized (c44361yw.A00) {
                Iterator it = c44361yw.A00.iterator();
                do {
                    c0g5 = (C0G5) it;
                    if (c0g5.hasNext()) {
                    }
                } while (((C24N) c0g5.next()) != null);
                throw null;
            }
            synchronized (c44521zD) {
                c44521zD.A01.A00 = null;
            }
            if (c44521zD.A02.A01.A07(C01C.A3O) != 0) {
                C44411z1 c44411z1 = c44521zD.A02;
                if (c44411z1 != null) {
                    Log.i("SyncdSoftFatalHandler/onFatalFailure");
                    c44411z1.A02.A02().putBoolean("syncd_soft_fatal_on_device", true).apply();
                    synchronized (c44411z1) {
                        c44411z1.A02.A02().putLong("syncd_soft_fatal_time", c44411z1.A03.A05()).apply();
                    }
                    c44411z1.A00.A09("SyncdSoftFatalHandler/onFatalFailure", null, true);
                    return;
                }
                throw null;
            }
            c44521zD.A01.A0P();
            return;
        }
        throw null;
    }

    public final void A02(C24O c24o, int i) {
        this.A00.A09("malformed_syncd_mutation", c24o.getMessage(), false);
        this.A04.A00.A06("invalid_action_counter", 1L);
        throw new C44921zs(i);
    }

    public final void A03(String str, C24O c24o) {
        StringBuilder A0P = C000200d.A0P("sync-response-handler/handleMutationException failed with MutationException, reason ");
        A0P.append(c24o.reason);
        Log.e(A0P.toString(), c24o);
        int i = c24o.reason;
        switch (i) {
            case 0:
                A02(c24o, 19);
                throw null;
            case 1:
                A02(c24o, 21);
                throw null;
            case 2:
                A02(c24o, 23);
                throw null;
            case 3:
                A02(c24o, 24);
                throw null;
            case 4:
                A02(c24o, 22);
                throw null;
            case 5:
                C44351yv c44351yv = this.A0D;
                int i2 = c24o.version;
                C44841zk c44841zk = c24o.operation;
                String str2 = c24o.index;
                if (str2 != null) {
                    C44651zQ c44651zQ = c24o.syncdKeyId;
                    if (c44651zQ != null) {
                        c44351yv.A0D(i2, c44841zk, str2, c44651zQ, str, c24o.syncActionValue);
                        this.A04.A00.A06("unsupported_action_counter", 1L);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 6:
                C44351yv c44351yv2 = this.A0D;
                int i3 = c24o.version;
                C44841zk c44841zk2 = c24o.operation;
                String str3 = c24o.index;
                if (str3 != null) {
                    C44651zQ c44651zQ2 = c24o.syncdKeyId;
                    if (c44651zQ2 != null) {
                        c44351yv2.A0D(i3, c44841zk2, str3, c44651zQ2, str, c24o.syncActionValue);
                        this.A00.A09("malformed_syncd_mutation", c24o.getMessage(), false);
                        this.A04.A00.A06("unsupported_action_counter", 1L);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 7:
                A02(c24o, 25);
                throw null;
            default:
                StringBuilder A0P2 = C000200d.A0P("Unhandled MutationException with reason: ");
                A0P2.append(i);
                throw new RuntimeException(A0P2.toString());
        }
    }

    public void A04(Throwable th) {
        if (th instanceof C44921zs) {
            A01(((C44921zs) th).errorCode);
        } else if (th instanceof C24P) {
            A00();
        } else if (th instanceof C24Q) {
            boolean z = ((C24Q) th).isServerTransient;
            A06(z, !z, this.A0E.A01());
        } else if (th instanceof SQLiteFullException) {
            A06(false, true, this.A0E.A01());
        } else {
            A06(true, false, this.A0E.A01());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:1185:0x08f8, code lost:
        if (r6.A02 != false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1222:0x09c8, code lost:
        if (r2.A04 > r7.A04) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1300:0x0b5c, code lost:
        throw new X.C44921zs(12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1302:0x0b64, code lost:
        throw new X.C44921zs(20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1304:0x0b6c, code lost:
        throw new X.C44921zs(17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1437:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:1401:0x0bda A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1449:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:831:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x015b A[Catch: 1zs -> 0x0be1, TryCatch #20 {1zs -> 0x0be1, blocks: (B:784:0x00c4, B:785:0x00d4, B:787:0x00de, B:789:0x00ea, B:791:0x00ee, B:793:0x00f2, B:794:0x00f4, B:796:0x00fa, B:798:0x00fe, B:799:0x0100, B:801:0x0105, B:803:0x0109, B:805:0x010d, B:806:0x010f, B:808:0x0114, B:810:0x0118, B:812:0x011b, B:814:0x011f, B:815:0x0121, B:817:0x0126, B:819:0x012a, B:821:0x0139, B:822:0x013b, B:825:0x0149, B:829:0x0150, B:832:0x0158, B:834:0x015d, B:836:0x0161, B:837:0x0163, B:1297:0x0b41, B:1298:0x0b54, B:833:0x015b, B:1299:0x0b55, B:1300:0x0b5c, B:1301:0x0b5d, B:1302:0x0b64, B:1303:0x0b65, B:1304:0x0b6c, B:1305:0x0b6d, B:1306:0x0b72, B:1307:0x0b73, B:1308:0x0b7a, B:838:0x017a, B:840:0x0189, B:842:0x018f, B:843:0x0191, B:845:0x0196, B:846:0x01a4, B:853:0x01cc, B:855:0x01d2, B:857:0x01d6, B:859:0x01da, B:861:0x01e4, B:863:0x01e7, B:864:0x0202, B:866:0x0208, B:867:0x0214, B:869:0x021c, B:870:0x021e, B:871:0x0226, B:873:0x023a, B:892:0x0284, B:893:0x02a2, B:895:0x02a8, B:896:0x02ae, B:898:0x02ba, B:900:0x02fc, B:901:0x0304, B:902:0x030c, B:904:0x0314, B:906:0x031d, B:910:0x0324, B:912:0x0328, B:915:0x0332, B:917:0x0337, B:919:0x033b, B:926:0x0359, B:928:0x035f, B:929:0x036c, B:934:0x0380, B:935:0x0384, B:937:0x038c, B:939:0x03b5, B:941:0x03bc, B:943:0x03c9, B:944:0x03ce, B:945:0x03cf, B:947:0x03d3, B:949:0x03e0, B:950:0x03e5, B:951:0x03e6, B:952:0x03fc, B:953:0x0403, B:954:0x0404, B:955:0x0411, B:957:0x0414, B:958:0x041f, B:930:0x036d, B:932:0x0372, B:933:0x037f, B:959:0x0420, B:960:0x042f, B:961:0x0430, B:962:0x043f, B:920:0x033e, B:963:0x0440, B:964:0x044d, B:965:0x044e, B:966:0x0455, B:967:0x0456, B:969:0x0458, B:1316:0x0b82, B:1317:0x0b8d, B:970:0x045f, B:972:0x047a, B:973:0x0485, B:975:0x048b, B:977:0x0497, B:978:0x049d, B:981:0x04a7, B:990:0x04da, B:991:0x04dd, B:992:0x04e5, B:994:0x04ed, B:995:0x04ef, B:997:0x0506, B:998:0x0513, B:1002:0x051c, B:984:0x04b2, B:986:0x04ba, B:987:0x04c9, B:989:0x04d1, B:1010:0x055b, B:1011:0x055e, B:1012:0x0569, B:1014:0x056f, B:1015:0x0575, B:1016:0x057c, B:1020:0x0586, B:1022:0x0590, B:1023:0x0598, B:1024:0x05bd, B:1025:0x05be, B:1026:0x05e3, B:1029:0x05e6, B:1031:0x05e8, B:1032:0x05ef, B:1033:0x05f8, B:1035:0x05ff, B:1037:0x060b, B:1038:0x0611, B:1039:0x0615, B:1041:0x061b, B:1043:0x0631, B:1044:0x0635, B:1046:0x063b, B:1048:0x0643, B:1050:0x064d, B:1054:0x0663, B:1056:0x0669, B:1058:0x0671, B:1061:0x067c, B:1059:0x0676, B:1062:0x068a, B:1064:0x069a, B:1065:0x06a6, B:1066:0x06aa, B:1068:0x06b0, B:1070:0x06be, B:1264:0x0aa8, B:1340:0x0bd0, B:1341:0x0bd1, B:1266:0x0aaf, B:1342:0x0bd2, B:1343:0x0bd9, B:1344:0x0bda, B:874:0x0247, B:891:0x027a, B:887:0x025b, B:888:0x0268, B:1309:0x0b7b, B:1310:0x0b7c, B:851:0x01bb, B:1345:0x0bdb, B:1346:0x0be0, B:1003:0x0527, B:1009:0x0558, B:1322:0x0b94), top: B:1395:0x00c4, inners: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:836:0x0161 A[Catch: 1zs -> 0x0be1, TryCatch #20 {1zs -> 0x0be1, blocks: (B:784:0x00c4, B:785:0x00d4, B:787:0x00de, B:789:0x00ea, B:791:0x00ee, B:793:0x00f2, B:794:0x00f4, B:796:0x00fa, B:798:0x00fe, B:799:0x0100, B:801:0x0105, B:803:0x0109, B:805:0x010d, B:806:0x010f, B:808:0x0114, B:810:0x0118, B:812:0x011b, B:814:0x011f, B:815:0x0121, B:817:0x0126, B:819:0x012a, B:821:0x0139, B:822:0x013b, B:825:0x0149, B:829:0x0150, B:832:0x0158, B:834:0x015d, B:836:0x0161, B:837:0x0163, B:1297:0x0b41, B:1298:0x0b54, B:833:0x015b, B:1299:0x0b55, B:1300:0x0b5c, B:1301:0x0b5d, B:1302:0x0b64, B:1303:0x0b65, B:1304:0x0b6c, B:1305:0x0b6d, B:1306:0x0b72, B:1307:0x0b73, B:1308:0x0b7a, B:838:0x017a, B:840:0x0189, B:842:0x018f, B:843:0x0191, B:845:0x0196, B:846:0x01a4, B:853:0x01cc, B:855:0x01d2, B:857:0x01d6, B:859:0x01da, B:861:0x01e4, B:863:0x01e7, B:864:0x0202, B:866:0x0208, B:867:0x0214, B:869:0x021c, B:870:0x021e, B:871:0x0226, B:873:0x023a, B:892:0x0284, B:893:0x02a2, B:895:0x02a8, B:896:0x02ae, B:898:0x02ba, B:900:0x02fc, B:901:0x0304, B:902:0x030c, B:904:0x0314, B:906:0x031d, B:910:0x0324, B:912:0x0328, B:915:0x0332, B:917:0x0337, B:919:0x033b, B:926:0x0359, B:928:0x035f, B:929:0x036c, B:934:0x0380, B:935:0x0384, B:937:0x038c, B:939:0x03b5, B:941:0x03bc, B:943:0x03c9, B:944:0x03ce, B:945:0x03cf, B:947:0x03d3, B:949:0x03e0, B:950:0x03e5, B:951:0x03e6, B:952:0x03fc, B:953:0x0403, B:954:0x0404, B:955:0x0411, B:957:0x0414, B:958:0x041f, B:930:0x036d, B:932:0x0372, B:933:0x037f, B:959:0x0420, B:960:0x042f, B:961:0x0430, B:962:0x043f, B:920:0x033e, B:963:0x0440, B:964:0x044d, B:965:0x044e, B:966:0x0455, B:967:0x0456, B:969:0x0458, B:1316:0x0b82, B:1317:0x0b8d, B:970:0x045f, B:972:0x047a, B:973:0x0485, B:975:0x048b, B:977:0x0497, B:978:0x049d, B:981:0x04a7, B:990:0x04da, B:991:0x04dd, B:992:0x04e5, B:994:0x04ed, B:995:0x04ef, B:997:0x0506, B:998:0x0513, B:1002:0x051c, B:984:0x04b2, B:986:0x04ba, B:987:0x04c9, B:989:0x04d1, B:1010:0x055b, B:1011:0x055e, B:1012:0x0569, B:1014:0x056f, B:1015:0x0575, B:1016:0x057c, B:1020:0x0586, B:1022:0x0590, B:1023:0x0598, B:1024:0x05bd, B:1025:0x05be, B:1026:0x05e3, B:1029:0x05e6, B:1031:0x05e8, B:1032:0x05ef, B:1033:0x05f8, B:1035:0x05ff, B:1037:0x060b, B:1038:0x0611, B:1039:0x0615, B:1041:0x061b, B:1043:0x0631, B:1044:0x0635, B:1046:0x063b, B:1048:0x0643, B:1050:0x064d, B:1054:0x0663, B:1056:0x0669, B:1058:0x0671, B:1061:0x067c, B:1059:0x0676, B:1062:0x068a, B:1064:0x069a, B:1065:0x06a6, B:1066:0x06aa, B:1068:0x06b0, B:1070:0x06be, B:1264:0x0aa8, B:1340:0x0bd0, B:1341:0x0bd1, B:1266:0x0aaf, B:1342:0x0bd2, B:1343:0x0bd9, B:1344:0x0bda, B:874:0x0247, B:891:0x027a, B:887:0x025b, B:888:0x0268, B:1309:0x0b7b, B:1310:0x0b7c, B:851:0x01bb, B:1345:0x0bdb, B:1346:0x0be0, B:1003:0x0527, B:1009:0x0558, B:1322:0x0b94), top: B:1395:0x00c4, inners: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:848:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x02a8 A[Catch: 1zs -> 0x0be1, TRY_LEAVE, TryCatch #20 {1zs -> 0x0be1, blocks: (B:784:0x00c4, B:785:0x00d4, B:787:0x00de, B:789:0x00ea, B:791:0x00ee, B:793:0x00f2, B:794:0x00f4, B:796:0x00fa, B:798:0x00fe, B:799:0x0100, B:801:0x0105, B:803:0x0109, B:805:0x010d, B:806:0x010f, B:808:0x0114, B:810:0x0118, B:812:0x011b, B:814:0x011f, B:815:0x0121, B:817:0x0126, B:819:0x012a, B:821:0x0139, B:822:0x013b, B:825:0x0149, B:829:0x0150, B:832:0x0158, B:834:0x015d, B:836:0x0161, B:837:0x0163, B:1297:0x0b41, B:1298:0x0b54, B:833:0x015b, B:1299:0x0b55, B:1300:0x0b5c, B:1301:0x0b5d, B:1302:0x0b64, B:1303:0x0b65, B:1304:0x0b6c, B:1305:0x0b6d, B:1306:0x0b72, B:1307:0x0b73, B:1308:0x0b7a, B:838:0x017a, B:840:0x0189, B:842:0x018f, B:843:0x0191, B:845:0x0196, B:846:0x01a4, B:853:0x01cc, B:855:0x01d2, B:857:0x01d6, B:859:0x01da, B:861:0x01e4, B:863:0x01e7, B:864:0x0202, B:866:0x0208, B:867:0x0214, B:869:0x021c, B:870:0x021e, B:871:0x0226, B:873:0x023a, B:892:0x0284, B:893:0x02a2, B:895:0x02a8, B:896:0x02ae, B:898:0x02ba, B:900:0x02fc, B:901:0x0304, B:902:0x030c, B:904:0x0314, B:906:0x031d, B:910:0x0324, B:912:0x0328, B:915:0x0332, B:917:0x0337, B:919:0x033b, B:926:0x0359, B:928:0x035f, B:929:0x036c, B:934:0x0380, B:935:0x0384, B:937:0x038c, B:939:0x03b5, B:941:0x03bc, B:943:0x03c9, B:944:0x03ce, B:945:0x03cf, B:947:0x03d3, B:949:0x03e0, B:950:0x03e5, B:951:0x03e6, B:952:0x03fc, B:953:0x0403, B:954:0x0404, B:955:0x0411, B:957:0x0414, B:958:0x041f, B:930:0x036d, B:932:0x0372, B:933:0x037f, B:959:0x0420, B:960:0x042f, B:961:0x0430, B:962:0x043f, B:920:0x033e, B:963:0x0440, B:964:0x044d, B:965:0x044e, B:966:0x0455, B:967:0x0456, B:969:0x0458, B:1316:0x0b82, B:1317:0x0b8d, B:970:0x045f, B:972:0x047a, B:973:0x0485, B:975:0x048b, B:977:0x0497, B:978:0x049d, B:981:0x04a7, B:990:0x04da, B:991:0x04dd, B:992:0x04e5, B:994:0x04ed, B:995:0x04ef, B:997:0x0506, B:998:0x0513, B:1002:0x051c, B:984:0x04b2, B:986:0x04ba, B:987:0x04c9, B:989:0x04d1, B:1010:0x055b, B:1011:0x055e, B:1012:0x0569, B:1014:0x056f, B:1015:0x0575, B:1016:0x057c, B:1020:0x0586, B:1022:0x0590, B:1023:0x0598, B:1024:0x05bd, B:1025:0x05be, B:1026:0x05e3, B:1029:0x05e6, B:1031:0x05e8, B:1032:0x05ef, B:1033:0x05f8, B:1035:0x05ff, B:1037:0x060b, B:1038:0x0611, B:1039:0x0615, B:1041:0x061b, B:1043:0x0631, B:1044:0x0635, B:1046:0x063b, B:1048:0x0643, B:1050:0x064d, B:1054:0x0663, B:1056:0x0669, B:1058:0x0671, B:1061:0x067c, B:1059:0x0676, B:1062:0x068a, B:1064:0x069a, B:1065:0x06a6, B:1066:0x06aa, B:1068:0x06b0, B:1070:0x06be, B:1264:0x0aa8, B:1340:0x0bd0, B:1341:0x0bd1, B:1266:0x0aaf, B:1342:0x0bd2, B:1343:0x0bd9, B:1344:0x0bda, B:874:0x0247, B:891:0x027a, B:887:0x025b, B:888:0x0268, B:1309:0x0b7b, B:1310:0x0b7c, B:851:0x01bb, B:1345:0x0bdb, B:1346:0x0be0, B:1003:0x0527, B:1009:0x0558, B:1322:0x0b94), top: B:1395:0x00c4, inners: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:972:0x047a A[Catch: 1zs -> 0x0be1, TryCatch #20 {1zs -> 0x0be1, blocks: (B:784:0x00c4, B:785:0x00d4, B:787:0x00de, B:789:0x00ea, B:791:0x00ee, B:793:0x00f2, B:794:0x00f4, B:796:0x00fa, B:798:0x00fe, B:799:0x0100, B:801:0x0105, B:803:0x0109, B:805:0x010d, B:806:0x010f, B:808:0x0114, B:810:0x0118, B:812:0x011b, B:814:0x011f, B:815:0x0121, B:817:0x0126, B:819:0x012a, B:821:0x0139, B:822:0x013b, B:825:0x0149, B:829:0x0150, B:832:0x0158, B:834:0x015d, B:836:0x0161, B:837:0x0163, B:1297:0x0b41, B:1298:0x0b54, B:833:0x015b, B:1299:0x0b55, B:1300:0x0b5c, B:1301:0x0b5d, B:1302:0x0b64, B:1303:0x0b65, B:1304:0x0b6c, B:1305:0x0b6d, B:1306:0x0b72, B:1307:0x0b73, B:1308:0x0b7a, B:838:0x017a, B:840:0x0189, B:842:0x018f, B:843:0x0191, B:845:0x0196, B:846:0x01a4, B:853:0x01cc, B:855:0x01d2, B:857:0x01d6, B:859:0x01da, B:861:0x01e4, B:863:0x01e7, B:864:0x0202, B:866:0x0208, B:867:0x0214, B:869:0x021c, B:870:0x021e, B:871:0x0226, B:873:0x023a, B:892:0x0284, B:893:0x02a2, B:895:0x02a8, B:896:0x02ae, B:898:0x02ba, B:900:0x02fc, B:901:0x0304, B:902:0x030c, B:904:0x0314, B:906:0x031d, B:910:0x0324, B:912:0x0328, B:915:0x0332, B:917:0x0337, B:919:0x033b, B:926:0x0359, B:928:0x035f, B:929:0x036c, B:934:0x0380, B:935:0x0384, B:937:0x038c, B:939:0x03b5, B:941:0x03bc, B:943:0x03c9, B:944:0x03ce, B:945:0x03cf, B:947:0x03d3, B:949:0x03e0, B:950:0x03e5, B:951:0x03e6, B:952:0x03fc, B:953:0x0403, B:954:0x0404, B:955:0x0411, B:957:0x0414, B:958:0x041f, B:930:0x036d, B:932:0x0372, B:933:0x037f, B:959:0x0420, B:960:0x042f, B:961:0x0430, B:962:0x043f, B:920:0x033e, B:963:0x0440, B:964:0x044d, B:965:0x044e, B:966:0x0455, B:967:0x0456, B:969:0x0458, B:1316:0x0b82, B:1317:0x0b8d, B:970:0x045f, B:972:0x047a, B:973:0x0485, B:975:0x048b, B:977:0x0497, B:978:0x049d, B:981:0x04a7, B:990:0x04da, B:991:0x04dd, B:992:0x04e5, B:994:0x04ed, B:995:0x04ef, B:997:0x0506, B:998:0x0513, B:1002:0x051c, B:984:0x04b2, B:986:0x04ba, B:987:0x04c9, B:989:0x04d1, B:1010:0x055b, B:1011:0x055e, B:1012:0x0569, B:1014:0x056f, B:1015:0x0575, B:1016:0x057c, B:1020:0x0586, B:1022:0x0590, B:1023:0x0598, B:1024:0x05bd, B:1025:0x05be, B:1026:0x05e3, B:1029:0x05e6, B:1031:0x05e8, B:1032:0x05ef, B:1033:0x05f8, B:1035:0x05ff, B:1037:0x060b, B:1038:0x0611, B:1039:0x0615, B:1041:0x061b, B:1043:0x0631, B:1044:0x0635, B:1046:0x063b, B:1048:0x0643, B:1050:0x064d, B:1054:0x0663, B:1056:0x0669, B:1058:0x0671, B:1061:0x067c, B:1059:0x0676, B:1062:0x068a, B:1064:0x069a, B:1065:0x06a6, B:1066:0x06aa, B:1068:0x06b0, B:1070:0x06be, B:1264:0x0aa8, B:1340:0x0bd0, B:1341:0x0bd1, B:1266:0x0aaf, B:1342:0x0bd2, B:1343:0x0bd9, B:1344:0x0bda, B:874:0x0247, B:891:0x027a, B:887:0x025b, B:888:0x0268, B:1309:0x0b7b, B:1310:0x0b7c, B:851:0x01bb, B:1345:0x0bdb, B:1346:0x0be0, B:1003:0x0527, B:1009:0x0558, B:1322:0x0b94), top: B:1395:0x00c4, inners: #19 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(java.util.List r42) {
        /*
            Method dump skipped, instructions count: 3156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44511zC.A05(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0059, code lost:
        if (r9 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06(boolean r8, boolean r9, java.lang.Long r10) {
        /*
            r7 = this;
            if (r8 == 0) goto L59
            X.1wc r6 = r7.A05
            android.content.SharedPreferences r0 = r6.A03()
            java.lang.String r5 = "first_transient_server_failure_timestamp"
            r3 = 0
            long r1 = r0.getLong(r5, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L46
            X.012 r0 = r7.A09
            long r1 = r0.A01()
            android.content.SharedPreferences$Editor r0 = r6.A02()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r5, r1)
            r0.apply()
        L25:
            if (r10 == 0) goto L87
            X.1zD r1 = r7.A03
            long r3 = r10.longValue()
            if (r1 == 0) goto L85
            java.lang.String r0 = "sync-manager/onRetryNeeded "
            X.C000200d.A0u(r0, r3)
            X.1u6 r5 = r1.A01
            r0 = 0
            X.C41541u6.A01(r5, r0)
            boolean r0 = r5.A0X()
            if (r0 == 0) goto L5c
            X.1z3 r0 = r1.A00
            r0.A02()
            return
        L46:
            X.012 r0 = r7.A09
            long r3 = r0.A01()
            long r3 = r3 - r1
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L25
            r0 = 1
            r7.A01(r0)
            return
        L59:
            if (r9 == 0) goto L87
            goto L25
        L5c:
            monitor-enter(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r1.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "sync-manager/scheduleSync with delay "
            r1.append(r0)     // Catch: java.lang.Throwable -> L82
            r1.append(r3)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L82
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> L82
            X.01k r2 = r5.A0V     // Catch: java.lang.Throwable -> L82
            r1 = 35
            java.lang.RunnableEBaseShape1S0100000_I0_1 r0 = new java.lang.RunnableEBaseShape1S0100000_I0_1     // Catch: java.lang.Throwable -> L82
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L82
            java.lang.Runnable r0 = r2.ASB(r0, r3)     // Catch: java.lang.Throwable -> L82
            r5.A01 = r0     // Catch: java.lang.Throwable -> L82
            monitor-exit(r5)
            return
        L82:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L85:
            r0 = 0
            throw r0
        L87:
            r7.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44511zC.A06(boolean, boolean, java.lang.Long):void");
    }
}
