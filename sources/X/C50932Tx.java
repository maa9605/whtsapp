package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2Tx */
/* loaded from: classes2.dex */
public final class C50932Tx implements C0OC {
    public boolean A00 = true;
    public final AbstractC000600i A01;
    public final C018508q A02;
    public final C02L A03;
    public final C0E3 A04;
    public final C01B A05;
    public final C0E6 A06;
    public final C06K A07;
    public final C41611uE A08;
    public final C05W A09;
    public final AnonymousClass075 A0A;
    public final AnonymousClass012 A0B;
    public final C001200o A0C;
    public final C002301c A0D;
    public final C0IO A0E;
    public final C01J A0F;
    public final C41181tV A0G;
    public final C05M A0H;
    public final C0C9 A0I;
    public final C013306k A0J;
    public final C013606n A0K;
    public final C0ED A0L;
    public final C003701t A0M;
    public final C07910aI A0N;
    public final C41671uK A0O;
    public final C41591uC A0P;
    public final C0EN A0Q;
    public final C0EG A0R;
    public final C41681uL A0S;
    public final C07860aD A0T;
    public final C41751uS A0U;
    public final C0EU A0V;
    public final C0EX A0W;
    public final C41821uZ A0X;
    public final C0DW A0Y;
    public final C0DV A0Z;
    public final C05190Nr A0a;
    public final C05U A0b;
    public final C0EY A0c;
    public final C41731uQ A0d;
    public final InterfaceC002901k A0e;
    public final boolean A0f;

    public C50932Tx(AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, C001200o c001200o, InterfaceC002901k interfaceC002901k, C05M c05m, C41181tV c41181tV, C0EG c0eg, C01B c01b, C0EN c0en, C0E6 c0e6, C05W c05w, C0ED c0ed, C0E3 c0e3, C002301c c002301c, C05U c05u, C0DV c0dv, C0C9 c0c9, C41591uC c41591uC, C01J c01j, C0EU c0eu, C41611uE c41611uE, C0EJ c0ej, AnonymousClass075 anonymousClass075, C41671uK c41671uK, C0DW c0dw, C41681uL c41681uL, C06K c06k, C013606n c013606n, C41731uQ c41731uQ, C41751uS c41751uS, C013306k c013306k, C0EX c0ex, C41821uZ c41821uZ, C0EY c0ey, C0IO c0io, C05190Nr c05190Nr, C07910aI c07910aI, boolean z) {
        this.A0B = anonymousClass012;
        this.A0M = c003701t;
        this.A02 = c018508q;
        this.A01 = abstractC000600i;
        this.A03 = c02l;
        this.A0C = c001200o;
        this.A0e = interfaceC002901k;
        this.A0H = c05m;
        this.A0G = c41181tV;
        this.A0R = c0eg;
        this.A0f = z;
        this.A05 = c01b;
        this.A0Q = c0en;
        this.A06 = c0e6;
        this.A09 = c05w;
        this.A0L = c0ed;
        this.A0D = c002301c;
        this.A04 = c0e3;
        this.A0b = c05u;
        this.A0Z = c0dv;
        this.A0I = c0c9;
        this.A0P = c41591uC;
        this.A0F = c01j;
        this.A0V = c0eu;
        this.A08 = c41611uE;
        this.A0A = anonymousClass075;
        this.A0O = c41671uK;
        this.A0Y = c0dw;
        this.A0S = c41681uL;
        this.A07 = c06k;
        this.A0K = c013606n;
        this.A0d = c41731uQ;
        this.A0U = c41751uS;
        this.A0J = c013306k;
        this.A0W = c0ex;
        this.A0X = c41821uZ;
        this.A0c = c0ey;
        this.A0E = c0io;
        this.A0a = c05190Nr;
        this.A0N = c07910aI;
        this.A0T = c0ej.A03(c05190Nr);
    }

    public final void A00(int i) {
        C0Ho.A0F(this.A0N, this.A0T, i);
        if (this.A0f) {
            this.A0Q.A05(this.A0a);
            this.A00 = false;
        }
    }

    public boolean A01(C40531sQ c40531sQ) {
        DeviceJid of;
        C05190Nr c05190Nr = this.A0a;
        AnonymousClass094 anonymousClass094 = c05190Nr.A09;
        if (anonymousClass094 == null) {
            anonymousClass094 = c05190Nr.A0b;
        }
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (!C003101m.A0b(abstractC005302j)) {
            return C003101m.A0U(abstractC005302j) && (of = DeviceJid.of(c05190Nr.A06)) != null && this.A03.A09(of) && c05190Nr.A08 == null && c05190Nr.A07 != null;
        }
        DeviceJid of2 = DeviceJid.of(c05190Nr.A03());
        if (of2 != null && this.A03.A09(of2)) {
            if ((c40531sQ.A00 & 2048) != 2048) {
                return true;
            }
            int i = c40531sQ.A15().A00;
            if ((i & 32) != 32 && (i & 64) != 64 && (i & 256) != 256) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1147:0x0afc, code lost:
        if (r7 != null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x04f4, code lost:
        if ((r9.A00 & 8) != 8) goto L288;
     */
    /* JADX WARN: Removed duplicated region for block: B:1076:0x09b7 A[Catch: 3TG -> 0x0bd2, 22W -> 0x0be8, TryCatch #3 {22W -> 0x0be8, blocks: (B:924:0x068e, B:926:0x069a, B:928:0x06a0, B:929:0x06a2, B:1149:0x0b00, B:1150:0x0b0a, B:1152:0x0b0e, B:1154:0x0b13, B:1155:0x0b1c, B:1157:0x0b22, B:1159:0x0b37, B:1160:0x0b40, B:1162:0x0b44, B:1164:0x0b5c, B:1165:0x0b61, B:1167:0x0b6f, B:1168:0x0b9b, B:1169:0x0b9f, B:930:0x06b4, B:932:0x06bc, B:934:0x06c3, B:935:0x06dd, B:936:0x06eb, B:938:0x06f0, B:939:0x0702, B:941:0x0708, B:943:0x070f, B:945:0x0719, B:946:0x071b, B:948:0x072c, B:950:0x0732, B:952:0x0748, B:954:0x0755, B:957:0x075a, B:958:0x0765, B:960:0x0789, B:961:0x078b, B:963:0x0799, B:965:0x07a0, B:967:0x07c7, B:969:0x07cd, B:971:0x07d4, B:975:0x07e0, B:977:0x07e6, B:979:0x07eb, B:981:0x07f4, B:984:0x07fc, B:986:0x080c, B:988:0x081c, B:990:0x0833, B:991:0x0852, B:992:0x0853, B:993:0x085a, B:994:0x085b, B:995:0x085c, B:996:0x085d, B:997:0x085e, B:998:0x0863, B:999:0x0864, B:1000:0x0869, B:1001:0x086a, B:1002:0x086f, B:1004:0x0872, B:1005:0x0882, B:1006:0x0883, B:1008:0x0899, B:1010:0x08a0, B:1012:0x08a4, B:1013:0x08a6, B:1015:0x08ae, B:1016:0x08b0, B:1018:0x08b6, B:1019:0x08bb, B:1021:0x08bf, B:1023:0x08c6, B:1025:0x08cb, B:1027:0x08cf, B:1028:0x08da, B:1030:0x08e0, B:1031:0x08ec, B:1033:0x08f2, B:1034:0x08fe, B:1035:0x091c, B:1037:0x0925, B:1038:0x0927, B:1040:0x092a, B:1042:0x092d, B:1044:0x0931, B:1051:0x093e, B:1053:0x0940, B:1054:0x0941, B:1055:0x096d, B:1056:0x0970, B:1070:0x0982, B:1071:0x0983, B:1073:0x098f, B:1074:0x09b3, B:1076:0x09b7, B:1078:0x09bb, B:1080:0x09c0, B:1086:0x09d4, B:1088:0x09da, B:1089:0x09e2, B:1091:0x09ec, B:1093:0x09f2, B:1112:0x0a36, B:1107:0x0a1d, B:1108:0x0a1e, B:1110:0x0a34, B:1171:0x0bcf, B:1172:0x0bd0, B:1113:0x0a37, B:1173:0x0bd1, B:1081:0x09c7, B:1083:0x09cb, B:1084:0x09d2, B:1125:0x0aa3, B:1138:0x0ae7, B:1139:0x0ae8, B:1142:0x0aef, B:1132:0x0ae1, B:1134:0x0ae3, B:1136:0x0ae5, B:1144:0x0af9, B:1145:0x0afa, B:1059:0x0975, B:1060:0x0976, B:1064:0x097b, B:1065:0x097c, B:1067:0x097e, B:1068:0x097f), top: B:1235:0x068e }] */
    /* JADX WARN: Removed duplicated region for block: B:1083:0x09cb A[Catch: 3TG -> 0x0bd2, 22W -> 0x0be8, TryCatch #3 {22W -> 0x0be8, blocks: (B:924:0x068e, B:926:0x069a, B:928:0x06a0, B:929:0x06a2, B:1149:0x0b00, B:1150:0x0b0a, B:1152:0x0b0e, B:1154:0x0b13, B:1155:0x0b1c, B:1157:0x0b22, B:1159:0x0b37, B:1160:0x0b40, B:1162:0x0b44, B:1164:0x0b5c, B:1165:0x0b61, B:1167:0x0b6f, B:1168:0x0b9b, B:1169:0x0b9f, B:930:0x06b4, B:932:0x06bc, B:934:0x06c3, B:935:0x06dd, B:936:0x06eb, B:938:0x06f0, B:939:0x0702, B:941:0x0708, B:943:0x070f, B:945:0x0719, B:946:0x071b, B:948:0x072c, B:950:0x0732, B:952:0x0748, B:954:0x0755, B:957:0x075a, B:958:0x0765, B:960:0x0789, B:961:0x078b, B:963:0x0799, B:965:0x07a0, B:967:0x07c7, B:969:0x07cd, B:971:0x07d4, B:975:0x07e0, B:977:0x07e6, B:979:0x07eb, B:981:0x07f4, B:984:0x07fc, B:986:0x080c, B:988:0x081c, B:990:0x0833, B:991:0x0852, B:992:0x0853, B:993:0x085a, B:994:0x085b, B:995:0x085c, B:996:0x085d, B:997:0x085e, B:998:0x0863, B:999:0x0864, B:1000:0x0869, B:1001:0x086a, B:1002:0x086f, B:1004:0x0872, B:1005:0x0882, B:1006:0x0883, B:1008:0x0899, B:1010:0x08a0, B:1012:0x08a4, B:1013:0x08a6, B:1015:0x08ae, B:1016:0x08b0, B:1018:0x08b6, B:1019:0x08bb, B:1021:0x08bf, B:1023:0x08c6, B:1025:0x08cb, B:1027:0x08cf, B:1028:0x08da, B:1030:0x08e0, B:1031:0x08ec, B:1033:0x08f2, B:1034:0x08fe, B:1035:0x091c, B:1037:0x0925, B:1038:0x0927, B:1040:0x092a, B:1042:0x092d, B:1044:0x0931, B:1051:0x093e, B:1053:0x0940, B:1054:0x0941, B:1055:0x096d, B:1056:0x0970, B:1070:0x0982, B:1071:0x0983, B:1073:0x098f, B:1074:0x09b3, B:1076:0x09b7, B:1078:0x09bb, B:1080:0x09c0, B:1086:0x09d4, B:1088:0x09da, B:1089:0x09e2, B:1091:0x09ec, B:1093:0x09f2, B:1112:0x0a36, B:1107:0x0a1d, B:1108:0x0a1e, B:1110:0x0a34, B:1171:0x0bcf, B:1172:0x0bd0, B:1113:0x0a37, B:1173:0x0bd1, B:1081:0x09c7, B:1083:0x09cb, B:1084:0x09d2, B:1125:0x0aa3, B:1138:0x0ae7, B:1139:0x0ae8, B:1142:0x0aef, B:1132:0x0ae1, B:1134:0x0ae3, B:1136:0x0ae5, B:1144:0x0af9, B:1145:0x0afa, B:1059:0x0975, B:1060:0x0976, B:1064:0x097b, B:1065:0x097c, B:1067:0x097e, B:1068:0x097f), top: B:1235:0x068e }] */
    /* JADX WARN: Removed duplicated region for block: B:1149:0x0b00 A[Catch: 3TG -> 0x0bd2, 22W -> 0x0be8, TryCatch #3 {22W -> 0x0be8, blocks: (B:924:0x068e, B:926:0x069a, B:928:0x06a0, B:929:0x06a2, B:1149:0x0b00, B:1150:0x0b0a, B:1152:0x0b0e, B:1154:0x0b13, B:1155:0x0b1c, B:1157:0x0b22, B:1159:0x0b37, B:1160:0x0b40, B:1162:0x0b44, B:1164:0x0b5c, B:1165:0x0b61, B:1167:0x0b6f, B:1168:0x0b9b, B:1169:0x0b9f, B:930:0x06b4, B:932:0x06bc, B:934:0x06c3, B:935:0x06dd, B:936:0x06eb, B:938:0x06f0, B:939:0x0702, B:941:0x0708, B:943:0x070f, B:945:0x0719, B:946:0x071b, B:948:0x072c, B:950:0x0732, B:952:0x0748, B:954:0x0755, B:957:0x075a, B:958:0x0765, B:960:0x0789, B:961:0x078b, B:963:0x0799, B:965:0x07a0, B:967:0x07c7, B:969:0x07cd, B:971:0x07d4, B:975:0x07e0, B:977:0x07e6, B:979:0x07eb, B:981:0x07f4, B:984:0x07fc, B:986:0x080c, B:988:0x081c, B:990:0x0833, B:991:0x0852, B:992:0x0853, B:993:0x085a, B:994:0x085b, B:995:0x085c, B:996:0x085d, B:997:0x085e, B:998:0x0863, B:999:0x0864, B:1000:0x0869, B:1001:0x086a, B:1002:0x086f, B:1004:0x0872, B:1005:0x0882, B:1006:0x0883, B:1008:0x0899, B:1010:0x08a0, B:1012:0x08a4, B:1013:0x08a6, B:1015:0x08ae, B:1016:0x08b0, B:1018:0x08b6, B:1019:0x08bb, B:1021:0x08bf, B:1023:0x08c6, B:1025:0x08cb, B:1027:0x08cf, B:1028:0x08da, B:1030:0x08e0, B:1031:0x08ec, B:1033:0x08f2, B:1034:0x08fe, B:1035:0x091c, B:1037:0x0925, B:1038:0x0927, B:1040:0x092a, B:1042:0x092d, B:1044:0x0931, B:1051:0x093e, B:1053:0x0940, B:1054:0x0941, B:1055:0x096d, B:1056:0x0970, B:1070:0x0982, B:1071:0x0983, B:1073:0x098f, B:1074:0x09b3, B:1076:0x09b7, B:1078:0x09bb, B:1080:0x09c0, B:1086:0x09d4, B:1088:0x09da, B:1089:0x09e2, B:1091:0x09ec, B:1093:0x09f2, B:1112:0x0a36, B:1107:0x0a1d, B:1108:0x0a1e, B:1110:0x0a34, B:1171:0x0bcf, B:1172:0x0bd0, B:1113:0x0a37, B:1173:0x0bd1, B:1081:0x09c7, B:1083:0x09cb, B:1084:0x09d2, B:1125:0x0aa3, B:1138:0x0ae7, B:1139:0x0ae8, B:1142:0x0aef, B:1132:0x0ae1, B:1134:0x0ae3, B:1136:0x0ae5, B:1144:0x0af9, B:1145:0x0afa, B:1059:0x0975, B:1060:0x0976, B:1064:0x097b, B:1065:0x097c, B:1067:0x097e, B:1068:0x097f), top: B:1235:0x068e }] */
    /* JADX WARN: Removed duplicated region for block: B:1157:0x0b22 A[Catch: 3TG -> 0x0bd2, 22W -> 0x0be8, TryCatch #3 {22W -> 0x0be8, blocks: (B:924:0x068e, B:926:0x069a, B:928:0x06a0, B:929:0x06a2, B:1149:0x0b00, B:1150:0x0b0a, B:1152:0x0b0e, B:1154:0x0b13, B:1155:0x0b1c, B:1157:0x0b22, B:1159:0x0b37, B:1160:0x0b40, B:1162:0x0b44, B:1164:0x0b5c, B:1165:0x0b61, B:1167:0x0b6f, B:1168:0x0b9b, B:1169:0x0b9f, B:930:0x06b4, B:932:0x06bc, B:934:0x06c3, B:935:0x06dd, B:936:0x06eb, B:938:0x06f0, B:939:0x0702, B:941:0x0708, B:943:0x070f, B:945:0x0719, B:946:0x071b, B:948:0x072c, B:950:0x0732, B:952:0x0748, B:954:0x0755, B:957:0x075a, B:958:0x0765, B:960:0x0789, B:961:0x078b, B:963:0x0799, B:965:0x07a0, B:967:0x07c7, B:969:0x07cd, B:971:0x07d4, B:975:0x07e0, B:977:0x07e6, B:979:0x07eb, B:981:0x07f4, B:984:0x07fc, B:986:0x080c, B:988:0x081c, B:990:0x0833, B:991:0x0852, B:992:0x0853, B:993:0x085a, B:994:0x085b, B:995:0x085c, B:996:0x085d, B:997:0x085e, B:998:0x0863, B:999:0x0864, B:1000:0x0869, B:1001:0x086a, B:1002:0x086f, B:1004:0x0872, B:1005:0x0882, B:1006:0x0883, B:1008:0x0899, B:1010:0x08a0, B:1012:0x08a4, B:1013:0x08a6, B:1015:0x08ae, B:1016:0x08b0, B:1018:0x08b6, B:1019:0x08bb, B:1021:0x08bf, B:1023:0x08c6, B:1025:0x08cb, B:1027:0x08cf, B:1028:0x08da, B:1030:0x08e0, B:1031:0x08ec, B:1033:0x08f2, B:1034:0x08fe, B:1035:0x091c, B:1037:0x0925, B:1038:0x0927, B:1040:0x092a, B:1042:0x092d, B:1044:0x0931, B:1051:0x093e, B:1053:0x0940, B:1054:0x0941, B:1055:0x096d, B:1056:0x0970, B:1070:0x0982, B:1071:0x0983, B:1073:0x098f, B:1074:0x09b3, B:1076:0x09b7, B:1078:0x09bb, B:1080:0x09c0, B:1086:0x09d4, B:1088:0x09da, B:1089:0x09e2, B:1091:0x09ec, B:1093:0x09f2, B:1112:0x0a36, B:1107:0x0a1d, B:1108:0x0a1e, B:1110:0x0a34, B:1171:0x0bcf, B:1172:0x0bd0, B:1113:0x0a37, B:1173:0x0bd1, B:1081:0x09c7, B:1083:0x09cb, B:1084:0x09d2, B:1125:0x0aa3, B:1138:0x0ae7, B:1139:0x0ae8, B:1142:0x0aef, B:1132:0x0ae1, B:1134:0x0ae3, B:1136:0x0ae5, B:1144:0x0af9, B:1145:0x0afa, B:1059:0x0975, B:1060:0x0976, B:1064:0x097b, B:1065:0x097c, B:1067:0x097e, B:1068:0x097f), top: B:1235:0x068e }] */
    /* JADX WARN: Removed duplicated region for block: B:1160:0x0b40 A[Catch: 3TG -> 0x0bd2, 22W -> 0x0be8, TryCatch #3 {22W -> 0x0be8, blocks: (B:924:0x068e, B:926:0x069a, B:928:0x06a0, B:929:0x06a2, B:1149:0x0b00, B:1150:0x0b0a, B:1152:0x0b0e, B:1154:0x0b13, B:1155:0x0b1c, B:1157:0x0b22, B:1159:0x0b37, B:1160:0x0b40, B:1162:0x0b44, B:1164:0x0b5c, B:1165:0x0b61, B:1167:0x0b6f, B:1168:0x0b9b, B:1169:0x0b9f, B:930:0x06b4, B:932:0x06bc, B:934:0x06c3, B:935:0x06dd, B:936:0x06eb, B:938:0x06f0, B:939:0x0702, B:941:0x0708, B:943:0x070f, B:945:0x0719, B:946:0x071b, B:948:0x072c, B:950:0x0732, B:952:0x0748, B:954:0x0755, B:957:0x075a, B:958:0x0765, B:960:0x0789, B:961:0x078b, B:963:0x0799, B:965:0x07a0, B:967:0x07c7, B:969:0x07cd, B:971:0x07d4, B:975:0x07e0, B:977:0x07e6, B:979:0x07eb, B:981:0x07f4, B:984:0x07fc, B:986:0x080c, B:988:0x081c, B:990:0x0833, B:991:0x0852, B:992:0x0853, B:993:0x085a, B:994:0x085b, B:995:0x085c, B:996:0x085d, B:997:0x085e, B:998:0x0863, B:999:0x0864, B:1000:0x0869, B:1001:0x086a, B:1002:0x086f, B:1004:0x0872, B:1005:0x0882, B:1006:0x0883, B:1008:0x0899, B:1010:0x08a0, B:1012:0x08a4, B:1013:0x08a6, B:1015:0x08ae, B:1016:0x08b0, B:1018:0x08b6, B:1019:0x08bb, B:1021:0x08bf, B:1023:0x08c6, B:1025:0x08cb, B:1027:0x08cf, B:1028:0x08da, B:1030:0x08e0, B:1031:0x08ec, B:1033:0x08f2, B:1034:0x08fe, B:1035:0x091c, B:1037:0x0925, B:1038:0x0927, B:1040:0x092a, B:1042:0x092d, B:1044:0x0931, B:1051:0x093e, B:1053:0x0940, B:1054:0x0941, B:1055:0x096d, B:1056:0x0970, B:1070:0x0982, B:1071:0x0983, B:1073:0x098f, B:1074:0x09b3, B:1076:0x09b7, B:1078:0x09bb, B:1080:0x09c0, B:1086:0x09d4, B:1088:0x09da, B:1089:0x09e2, B:1091:0x09ec, B:1093:0x09f2, B:1112:0x0a36, B:1107:0x0a1d, B:1108:0x0a1e, B:1110:0x0a34, B:1171:0x0bcf, B:1172:0x0bd0, B:1113:0x0a37, B:1173:0x0bd1, B:1081:0x09c7, B:1083:0x09cb, B:1084:0x09d2, B:1125:0x0aa3, B:1138:0x0ae7, B:1139:0x0ae8, B:1142:0x0aef, B:1132:0x0ae1, B:1134:0x0ae3, B:1136:0x0ae5, B:1144:0x0af9, B:1145:0x0afa, B:1059:0x0975, B:1060:0x0976, B:1064:0x097b, B:1065:0x097c, B:1067:0x097e, B:1068:0x097f), top: B:1235:0x068e }] */
    /* JADX WARN: Removed duplicated region for block: B:1187:0x0bf4  */
    /* JADX WARN: Removed duplicated region for block: B:1191:0x0c2a  */
    /* JADX WARN: Removed duplicated region for block: B:1197:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:1214:0x0c91  */
    /* JADX WARN: Removed duplicated region for block: B:1253:0x0526 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:715:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:885:0x05c7  */
    @Override // X.C0OC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AEI(byte[] r46) {
        /*
            Method dump skipped, instructions count: 3274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50932Tx.AEI(byte[]):void");
    }
}
