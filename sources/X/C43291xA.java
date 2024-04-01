package X;

import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1xA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43291xA {
    public int A00 = 0;
    public String A01;
    public StringBuilder A02;
    public final AnonymousClass031 A03;
    public final C002301c A04;

    static {
        new HashSet(Arrays.asList("CELL", "AOL", "APPLELINK", "ATTMAIL", "CIS", "EWORLD", "INTERNET", "IBMMAIL", "MCIMAIL", "POWERSHARE", "PRODIGY", "TLX", "X400"));
        new HashSet(Arrays.asList("PREF", "WORK", "HOME", "VOICE", "FAX", "MSG", "CELL", "PAGER", "BBS", "MODEM", "CAR", "ISDN", "VIDEO"));
        new HashSet(Arrays.asList("BLOG", "FTP", "HOMEPAGE", "PROFILE", "OTHER", "HOME", "WORK"));
    }

    public C43291xA(C002301c c002301c, AnonymousClass031 anonymousClass031) {
        this.A04 = c002301c;
        this.A03 = anonymousClass031;
    }

    public static String A00(C001200o c001200o, C05W c05w, C002301c c002301c, AnonymousClass031 anonymousClass031, C06K c06k, String str) {
        List<C09010cT> list;
        try {
            C43291xA c43291xA = new C43291xA(c002301c, anonymousClass031);
            C04110Ip A05 = C04110Ip.A05(c001200o, c05w, c002301c, c06k, str);
            if (A05 != null && (list = A05.A05) != null) {
                if (list != null) {
                    for (C09010cT c09010cT : list) {
                        C06C A0C = c05w.A0C(c09010cT.A02);
                        if (A0C != null) {
                            c09010cT.A01 = (UserJid) A0C.A03(UserJid.class);
                        }
                    }
                }
                return c43291xA.A03(A05);
            }
        } catch (C43301xB e) {
            Log.e("addWaIdsToVCard", e);
        }
        return str;
    }

    public static void A01(C01B c01b, C05W c05w, C04110Ip c04110Ip) {
        List<C09010cT> list = c04110Ip.A05;
        if (list != null) {
            for (C09010cT c09010cT : list) {
                C06C A0C = c05w.A0C(c09010cT.A02);
                if (A0C == null) {
                    return;
                }
                if (c01b.A0E(C01C.A2G) && A0C.A0B()) {
                    C75913fk c75913fk = c04110Ip.A08;
                    c75913fk.A08 = c75913fk.A01;
                    String A02 = c04110Ip.A0A.A02((UserJid) A0C.A03(UserJid.class));
                    if (!TextUtils.isEmpty(A02)) {
                        c04110Ip.A01 = A02;
                    }
                }
                UserJid userJid = (UserJid) A0C.A03(UserJid.class);
                if (A0C.A0X && userJid != null) {
                    c09010cT.A01 = userJid;
                    return;
                }
            }
        }
    }

    public static final boolean A02(String str) {
        return str == null || str.trim().equals("");
    }

    public String A03(C04110Ip c04110Ip) {
        String str;
        String str2;
        UserJid userJid;
        String str3;
        String substring;
        StringBuilder sb = new StringBuilder();
        this.A02 = sb;
        C75913fk c75913fk = c04110Ip.A08;
        if (c75913fk != null && c75913fk.A01 == null) {
            c75913fk.A01 = "";
        }
        this.A01 = "\n";
        sb.append("BEGIN:VCARD");
        sb.append("\n");
        sb.append("VERSION:3.0");
        sb.append("\n");
        if (c75913fk != null) {
            sb.append("N:");
            String str4 = c75913fk.A00;
            if (str4 != null) {
                sb.append(str4);
                sb.append(";");
            } else {
                sb.append(";");
            }
            String str5 = c75913fk.A02;
            if (str5 != null) {
                sb.append(str5);
                sb.append(";");
            } else {
                sb.append(";");
            }
            String str6 = c75913fk.A03;
            if (str6 != null) {
                sb.append(str6);
                sb.append(";");
            } else {
                sb.append(";");
            }
            String str7 = c75913fk.A06;
            if (str7 != null) {
                sb.append(str7);
                sb.append(";");
            } else {
                sb.append(";");
            }
            String str8 = c75913fk.A07;
            if (str8 != null) {
                sb.append(str8);
            }
            sb.append("\n");
            sb.append("FN:");
            sb.append(c75913fk.A01);
            sb.append("\n");
        }
        Map map = c04110Ip.A07;
        if (map != null && map.containsKey("NICKNAME")) {
            StringBuilder sb2 = this.A02;
            sb2.append("NICKNAME:");
            sb2.append(((C55392kL) ((List) c04110Ip.A07.get("NICKNAME")).get(0)).A02);
            sb2.append(this.A01);
        }
        C75913fk c75913fk2 = c04110Ip.A08;
        if (c75913fk2 != null) {
            String str9 = c75913fk2.A04;
            if (str9 != null) {
                StringBuilder sb3 = this.A02;
                sb3.append("X-PHONETIC-FIRST-NAME:");
                sb3.append(str9);
                sb3.append(this.A01);
            }
            String str10 = c75913fk2.A05;
            if (str10 != null) {
                StringBuilder sb4 = this.A02;
                sb4.append("X-PHONETIC-LAST-NAME:");
                sb4.append(str10);
                sb4.append(this.A01);
            }
        }
        List list = c04110Ip.A04;
        if (list != null && list.size() > 0) {
            String str11 = ((C75923fl) c04110Ip.A04.get(0)).A00;
            String str12 = ((C75923fl) c04110Ip.A04.get(0)).A01;
            if (str11 != null) {
                StringBuilder sb5 = this.A02;
                sb5.append("ORG:");
                sb5.append(str11);
                sb5.append(this.A01);
            }
            if (str12 != null) {
                StringBuilder sb6 = this.A02;
                sb6.append("TITLE:");
                sb6.append(str12);
                sb6.append(this.A01);
            }
        }
        if (c04110Ip.A03.size() > 0 && !A02((String) c04110Ip.A03.get(0))) {
            StringBuilder sb7 = this.A02;
            sb7.append("NOTE:");
            String str13 = (String) c04110Ip.A03.get(0);
            if (str13.endsWith("\r\n")) {
                substring = str13.substring(0, str13.length() - 2);
            } else if (str13.endsWith("\n")) {
                substring = str13.substring(0, str13.length() - 1);
            } else {
                str3 = null;
                sb7.append(str3);
                sb7.append(this.A01);
            }
            str3 = substring.replaceAll("\r\n", "\n").replaceAll("\n", "\n ");
            sb7.append(str3);
            sb7.append(this.A01);
        }
        List<C09010cT> list2 = c04110Ip.A05;
        if (list2 != null) {
            HashMap hashMap = new HashMap();
            for (C09010cT c09010cT : list2) {
                if (hashMap.containsKey(c09010cT.A02)) {
                    C09010cT c09010cT2 = (C09010cT) hashMap.get(c09010cT.A02);
                    int i = c09010cT2.A00;
                    if (i == -1 && c09010cT.A00 == -1) {
                        c09010cT2.A00 = 1;
                    } else if (i == -1 || (i == 0 && c09010cT.A00 != -1)) {
                        int i2 = c09010cT.A00;
                        c09010cT2.A00 = i2;
                        if (i2 == 0) {
                            c09010cT2.A03 = c09010cT.A03;
                        }
                    }
                    String str14 = c09010cT2.A03;
                    if ((str14 == null || str14.equalsIgnoreCase("null")) && (str2 = c09010cT.A03) != null && !str2.equalsIgnoreCase("null")) {
                        c09010cT2.A03 = str2;
                    } else if (str14 == null) {
                        c09010cT2.A03 = "HOME";
                    }
                    if (c09010cT2.A04 || c09010cT.A04) {
                        c09010cT2.A04 = true;
                    }
                    if (c09010cT2.A01 == null && (userJid = c09010cT.A01) != null) {
                        c09010cT2.A01 = userJid;
                    }
                } else {
                    hashMap.put(c09010cT.A02, c09010cT);
                }
            }
            for (C09010cT c09010cT3 : hashMap.values()) {
                String str15 = c09010cT3.A02;
                if (!A02(str15)) {
                    int i3 = c09010cT3.A00;
                    if (i3 == 0) {
                        int i4 = this.A00 + 1;
                        this.A00 = i4;
                        StringBuilder sb8 = this.A02;
                        sb8.append("item");
                        sb8.append(i4);
                        sb8.append(".TEL");
                        UserJid userJid2 = c09010cT3.A01;
                        String str16 = userJid2 == null ? null : userJid2.user;
                        if (str16 != null) {
                            sb8.append(";waid=");
                            sb8.append(str16);
                        }
                        sb8.append(':');
                        sb8.append(str15);
                        String str17 = this.A01;
                        sb8.append(str17);
                        sb8.append("item");
                        sb8.append(i4);
                        sb8.append(".X-ABLabel:");
                        sb8.append(c09010cT3.A03);
                        sb8.append(str17);
                    } else {
                        String A07 = this.A04.A07(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(i3));
                        if (A07.indexOf(59) != -1) {
                            A07 = A07.replace(';', ',');
                        }
                        StringBuilder sb9 = this.A02;
                        sb9.append("TEL;type=");
                        sb9.append(A07);
                        UserJid userJid3 = c09010cT3.A01;
                        String str18 = userJid3 == null ? null : userJid3.user;
                        if (str18 != null) {
                            sb9.append(";waid=");
                            sb9.append(str18);
                        }
                        sb9.append(':');
                        sb9.append(c09010cT3.A02);
                        sb9.append(this.A01);
                    }
                }
            }
        }
        List<C75943fn> list3 = c04110Ip.A06;
        if (list3 != null) {
            for (C75943fn c75943fn : list3) {
                String str19 = c75943fn.A01;
                if (!A02(str19)) {
                    int i5 = c75943fn.A00;
                    if (i5 != 4 && i5 != 5) {
                        if (i5 == 1) {
                            str = "HOMEPAGE";
                        } else if (i5 == 2) {
                            str = "BLOG";
                        } else if (i5 != 3) {
                            str = i5 != 6 ? "OTHER" : "FTP";
                        } else {
                            str = "PROFILE";
                        }
                        int i6 = this.A00 + 1;
                        this.A00 = i6;
                        StringBuilder sb10 = this.A02;
                        sb10.append("item");
                        sb10.append(i6);
                        sb10.append(".URL:");
                        sb10.append(str19);
                        String str20 = this.A01;
                        sb10.append(str20);
                        sb10.append("item");
                        sb10.append(i6);
                        sb10.append(".X-ABLabel:");
                        sb10.append(str);
                        sb10.append(str20);
                    } else {
                        String str21 = i5 == 4 ? "HOME" : "WORK";
                        if (str21.indexOf(";") != -1) {
                            str21 = str21.replace(";", ",");
                        }
                        StringBuilder sb11 = this.A02;
                        sb11.append("URL;type=");
                        sb11.append(str21);
                        sb11.append(":");
                        sb11.append(c75943fn.A01);
                        sb11.append(this.A01);
                    }
                }
            }
        }
        List<C75903fj> list4 = c04110Ip.A02;
        if (list4 != null) {
            for (C75903fj c75903fj : list4) {
                Class cls = c75903fj.A01;
                if (cls == ContactsContract.CommonDataKinds.Email.class) {
                    String str22 = c75903fj.A02;
                    if (!A02(str22)) {
                        int i7 = c75903fj.A00;
                        if (i7 == 0) {
                            int i8 = this.A00 + 1;
                            this.A00 = i8;
                            StringBuilder sb12 = this.A02;
                            sb12.append("item");
                            sb12.append(i8);
                            sb12.append(".EMAIL;type=INTERNET:");
                            sb12.append(str22);
                            String str23 = this.A01;
                            sb12.append(str23);
                            sb12.append("item");
                            sb12.append(i8);
                            sb12.append(".X-ABLabel:");
                            sb12.append(c75903fj.A03);
                            sb12.append(str23);
                        } else {
                            String A072 = this.A04.A07(ContactsContract.CommonDataKinds.Email.getTypeLabelResource(i7));
                            StringBuilder sb13 = this.A02;
                            sb13.append("EMAIL;TYPE=");
                            sb13.append(A072);
                            sb13.append(":");
                            sb13.append(c75903fj.A02);
                            sb13.append(this.A01);
                        }
                    }
                } else if (cls == ContactsContract.CommonDataKinds.StructuredPostal.class) {
                    int i9 = this.A00 + 1;
                    this.A00 = i9;
                    C75893fi c75893fi = c75903fj.A04;
                    if (c75893fi != null) {
                        int i10 = c75903fj.A00;
                        if (i10 == 0) {
                            StringBuilder sb14 = this.A02;
                            sb14.append("item");
                            sb14.append(i9);
                            sb14.append(".ADR:;;");
                            sb14.append(c75893fi.A01());
                            sb14.append(this.A01);
                            sb14.append("item");
                            sb14.append(i9);
                            sb14.append(".X-ABADR:");
                            String str24 = c75893fi.A01;
                            if (str24 != null) {
                                try {
                                    sb14.append(this.A03.A04(str24).toLowerCase(Locale.US));
                                } catch (IOException e) {
                                    Log.e("vcardcomposer/appendwapostalstr failed isoFromNativeName", e);
                                }
                            }
                            StringBuilder sb15 = this.A02;
                            String str25 = this.A01;
                            sb15.append(str25);
                            sb15.append("item");
                            sb15.append(this.A00);
                            sb15.append(".X-ABLabel:");
                            sb15.append(c75903fj.A03);
                            sb15.append(str25);
                        } else {
                            String A073 = this.A04.A07(ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabelResource(i10));
                            StringBuilder sb16 = this.A02;
                            sb16.append("item");
                            int i11 = this.A00;
                            sb16.append(i11);
                            sb16.append(".ADR;type=");
                            sb16.append(A073);
                            sb16.append(":;;");
                            C75893fi c75893fi2 = c75903fj.A04;
                            sb16.append(c75893fi2.A01());
                            sb16.append(this.A01);
                            sb16.append("item");
                            sb16.append(i11);
                            sb16.append(".X-ABADR:");
                            String str26 = c75893fi2.A01;
                            if (str26 != null) {
                                try {
                                    sb16.append(this.A03.A04(str26).toLowerCase(Locale.US));
                                } catch (IOException e2) {
                                    Log.e("vcardcomposer/appendwapostalstr failed isoFromNativeName", e2);
                                }
                            }
                            this.A02.append(this.A01);
                        }
                    } else {
                        Log.e("appendWAPostalStr addr_data is NULL");
                    }
                }
            }
        }
        Map map2 = c04110Ip.A07;
        if (map2 != null && map2.containsKey("BDAY")) {
            StringBuilder sb17 = this.A02;
            sb17.append("BDAY;value=date:");
            sb17.append(((C55392kL) ((List) c04110Ip.A07.get("BDAY")).get(0)).A02);
            sb17.append(this.A01);
        }
        Map map3 = c04110Ip.A07;
        if (map3 != null) {
            for (String str27 : map3.keySet()) {
                if (C04110Ip.A0G.containsKey(str27)) {
                    C55392kL c55392kL = (C55392kL) ((List) c04110Ip.A07.get(str27)).get(0);
                    StringBuilder sb18 = this.A02;
                    sb18.append(str27);
                    sb18.append(";");
                    Set set = c55392kL.A04;
                    if (set != null && set.size() > 0) {
                        StringBuilder sb19 = this.A02;
                        sb19.append("type=");
                        sb19.append(c55392kL.A04.toArray()[0]);
                        sb19.append(":");
                    } else {
                        StringBuilder sb20 = this.A02;
                        sb20.append("type=HOME");
                        sb20.append(":");
                    }
                    StringBuilder sb21 = this.A02;
                    sb21.append(c55392kL.A02);
                    sb21.append(this.A01);
                }
            }
        }
        byte[] bArr = c04110Ip.A09;
        if (bArr != null) {
            StringBuilder sb22 = this.A02;
            sb22.append("PHOTO;BASE64:");
            sb22.append(Base64.encodeToString(bArr, 2));
            sb22.append(this.A01);
        }
        if (!TextUtils.isEmpty(c04110Ip.A08.A08)) {
            String str28 = c04110Ip.A01;
            if (str28 != null && str28.length() > 0) {
                StringBuilder sb23 = this.A02;
                StringBuilder A0P = C000200d.A0P("X-WA-BIZ-DESCRIPTION:");
                A0P.append(str28);
                sb23.append(A0P.toString());
                sb23.append(this.A01);
            }
            StringBuilder sb24 = this.A02;
            StringBuilder A0P2 = C000200d.A0P("X-WA-BIZ-NAME:");
            A0P2.append(c04110Ip.A08.A08);
            sb24.append(A0P2.toString());
            sb24.append(this.A01);
        }
        StringBuilder sb25 = this.A02;
        sb25.append("END:VCARD");
        return sb25.toString();
    }
}
