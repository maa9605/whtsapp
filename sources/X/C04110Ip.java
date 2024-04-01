package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.0Ip */
/* loaded from: classes.dex */
public class C04110Ip {
    public static HashMap A0F;
    public static HashMap A0G;
    public String A00;
    public String A01;
    public List A02;
    public List A04;
    public List A05;
    public List A06;
    public Map A07;
    public byte[] A09;
    public final C06K A0A;
    public final C05W A0B;
    public final C001200o A0C;
    public final C002301c A0D;
    public C75913fk A08 = new C75913fk();
    public List A03 = new ArrayList();
    public final C75933fm A0E = new C75933fm();

    static {
        HashMap hashMap = new HashMap();
        A0G = hashMap;
        A0F = new HashMap();
        hashMap.put("X-AIM", 0);
        A0G.put("X-MSN", 1);
        A0G.put("X-YAHOO", 2);
        A0G.put("X-GOOGLE-TALK", 5);
        A0G.put("X-GOOGLE TAL", 5);
        A0G.put("X-ICQ", 6);
        A0G.put("X-JABBER", 7);
        A0G.put("X-SKYPE-USERNAME", 3);
        A0F.put("X-AIM", "AIM");
        A0F.put("X-MSN", "Windows Live");
        A0F.put("X-YAHOO", "YAHOO");
        A0F.put("X-GOOGLE-TALK", "Google Talk");
        A0F.put("X-GOOGLE TAL", "Google Talk");
        A0F.put("X-ICQ", "ICQ");
        A0F.put("X-JABBER", "Jabber");
        A0F.put("X-SKYPE-USERNAME", "Skype");
        A0F.put("NICKNAME", "Nickname");
        A0F.put("BDAY", "Birthday");
    }

    public C04110Ip(C001200o c001200o, C05W c05w, C002301c c002301c, C06K c06k) {
        this.A0C = c001200o;
        this.A0B = c05w;
        this.A0D = c002301c;
        this.A0A = c06k;
    }

    public static String A00(C001200o c001200o, C05W c05w, C002301c c002301c, C06K c06k, String str) {
        C43281x9 A04 = A04(str);
        if (A04 != null) {
            Iterator it = A04.A02.iterator();
            C55392kL c55392kL = null;
            C55392kL c55392kL2 = null;
            C55392kL c55392kL3 = null;
            while (it.hasNext()) {
                C55392kL c55392kL4 = (C55392kL) it.next();
                String str2 = c55392kL4.A01;
                if (!TextUtils.isEmpty(c55392kL4.A02)) {
                    if ("FN".equals(str2)) {
                        c55392kL = c55392kL4;
                    } else if ("NAME".equals(str2)) {
                        c55392kL2 = c55392kL4;
                    } else if ("ORG".equals(str2) && c55392kL3 == null) {
                        c55392kL3 = c55392kL4;
                    }
                }
            }
            if (c55392kL != null) {
                return c55392kL.A02;
            }
            if (c55392kL2 != null) {
                return c55392kL2.A02;
            }
            if (c55392kL3 != null) {
                return A01(c55392kL3.A03);
            }
            C04110Ip A06 = A06(c001200o, c05w, c002301c, c06k, A04);
            if (A06 != null) {
                return A06.A08();
            }
        }
        return null;
    }

    public static String A01(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static List A02(C001200o c001200o, C05W c05w, C002301c c002301c, C06K c06k, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            C04110Ip A05 = A05(c001200o, c05w, c002301c, c06k, str);
            if (A05 != null) {
                arrayList.add(new C04120Iq(str, A05));
                C75933fm c75933fm = A05.A0E;
                i += c75933fm.A01;
                i2 += c75933fm.A00;
            }
        }
        if (i > 0 || i2 > 0) {
            StringBuilder sb = new StringBuilder("contactstruct/construct/too_long=");
            sb.append(i);
            sb.append("; exceed_max=");
            sb.append(i2);
            Log.w(sb.toString());
        }
        return arrayList;
    }

    public static Map A03(String str, Context context) {
        HashMap hashMap = new HashMap();
        Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", context.getString(R.string.app_name)).appendQueryParameter("account_type", "com.whatsapp").build();
        Cursor query = context.getContentResolver().query(build, new String[]{"sync1", "_id"}, "contact_id=?", new String[]{str}, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(query.getColumnIndex("_id"));
                    UserJid nullable = UserJid.getNullable(query.getString(query.getColumnIndex("sync1")));
                    if (nullable != null) {
                        hashMap.put(string, nullable);
                    }
                } finally {
                }
            }
        }
        if (query != null) {
        }
        return hashMap;
    }

    public static C43281x9 A04(String str) {
        if (str == null) {
            return null;
        }
        C43271x8 c43271x8 = new C43271x8();
        try {
            C40961t9.A01(str, c43271x8);
            List list = c43271x8.A04;
            if (list.size() <= 0 || !((C43281x9) list.get(0)).A01.equals("VCARD")) {
                return null;
            }
            return (C43281x9) list.get(0);
        } catch (C43301xB e) {
            StringBuilder sb = new StringBuilder("Error parsing vcard:");
            sb.append(str);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    public static C04110Ip A05(C001200o c001200o, C05W c05w, C002301c c002301c, C06K c06k, String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C43281x9 A04 = A04(str);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (A04 != null) {
            C04110Ip A06 = A06(c001200o, c05w, c002301c, c06k, A04);
            long uptimeMillis3 = SystemClock.uptimeMillis();
            if (A06 != null) {
                C75933fm c75933fm = A06.A0E;
                c75933fm.A04 = uptimeMillis2 - uptimeMillis;
                c75933fm.A02 = uptimeMillis3 - uptimeMillis2;
                return A06;
            }
            return null;
        }
        return null;
    }

    public static C04110Ip A06(C001200o c001200o, C05W c05w, C002301c c002301c, C06K c06k, C43281x9 c43281x9) {
        List list;
        List list2;
        List list3;
        List list4;
        String str;
        C75893fi c75893fi;
        UserJid fromIdentifier;
        if (!c43281x9.A01.equals("VCARD")) {
            Log.e("Non VCARD data is inserted.");
            return null;
        }
        C04110Ip c04110Ip = new C04110Ip(c001200o, c05w, c002301c, c06k);
        Iterator it = c43281x9.A02.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            C55392kL c55392kL = (C55392kL) it.next();
            String str2 = c55392kL.A01;
            if (!TextUtils.isEmpty(c55392kL.A02) && !str2.equals("VERSION")) {
                if (str2.equals("FN")) {
                    c04110Ip.A08.A01 = c55392kL.A02;
                } else {
                    if (str2.equals("NAME")) {
                        C75913fk c75913fk = c04110Ip.A08;
                        if (c75913fk.A01 == null) {
                            c75913fk.A01 = c55392kL.A02;
                        }
                    }
                    if (str2.equals("N")) {
                        A07(c04110Ip.A08, c55392kL.A03);
                    } else if (str2.equals("SORT-STRING")) {
                        c04110Ip.A00 = c55392kL.A02;
                    } else if (str2.equals("SOUND")) {
                        if (c55392kL.A04.contains("X-IRMC-N") && c04110Ip.A00 == null) {
                            StringBuilder sb = new StringBuilder();
                            String str3 = c55392kL.A02;
                            int length = str3.length();
                            for (int i = 0; i < length; i++) {
                                char charAt = str3.charAt(i);
                                if (charAt != ';') {
                                    sb.append(charAt);
                                }
                            }
                            c04110Ip.A00 = sb.toString();
                        } else {
                            c04110Ip.A0F(c55392kL);
                        }
                    } else {
                        int i2 = -1;
                        if (str2.equals("ADR")) {
                            Iterator it2 = c55392kL.A03.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (((String) it2.next()).length() > 0) {
                                    boolean z5 = false;
                                    String str4 = "";
                                    for (String str5 : c55392kL.A04) {
                                        if (!str5.equals("PREF") || z2) {
                                            if (str5.equalsIgnoreCase("HOME")) {
                                                i2 = 1;
                                            } else if (str5.equalsIgnoreCase("WORK") || str5.equalsIgnoreCase("COMPANY")) {
                                                i2 = 2;
                                            } else if (!str5.equalsIgnoreCase("POSTAL") && !str5.equalsIgnoreCase("PARCEL") && !str5.equalsIgnoreCase("DOM") && !str5.equalsIgnoreCase("INTL")) {
                                                if (str5.toUpperCase(Locale.US).startsWith("X-")) {
                                                    if (i2 < 0) {
                                                        str5 = str5.substring(2);
                                                        str4 = str5;
                                                        i2 = 0;
                                                    }
                                                } else if (i2 < 0) {
                                                    str4 = str5;
                                                    i2 = 0;
                                                }
                                            }
                                            str4 = "";
                                        } else {
                                            z2 = true;
                                            z5 = true;
                                        }
                                    }
                                    if (i2 < 0) {
                                        i2 = 1;
                                    }
                                    List list5 = c55392kL.A03;
                                    if (list5.size() > 1) {
                                        c75893fi = new C75893fi();
                                        if (list5.size() > 2) {
                                            c75893fi.A03 = (String) list5.get(2);
                                        }
                                        if (list5.size() > 3) {
                                            c75893fi.A00 = (String) list5.get(3);
                                        }
                                        if (list5.size() > 4) {
                                            c75893fi.A02 = (String) list5.get(4);
                                        }
                                        if (list5.size() > 5) {
                                            c75893fi.A04 = (String) list5.get(5);
                                        }
                                        if (list5.size() > 6) {
                                            c75893fi.A01 = (String) list5.get(6);
                                        }
                                        if (list5.size() > 7) {
                                            list5.get(7);
                                        }
                                        str = c75893fi.toString().trim();
                                    } else {
                                        str = c55392kL.A02;
                                        c75893fi = null;
                                    }
                                    List list6 = c04110Ip.A02;
                                    if (list6 == null) {
                                        list6 = new ArrayList();
                                        c04110Ip.A02 = list6;
                                    }
                                    C75903fj c75903fj = new C75903fj();
                                    c75903fj.A01 = ContactsContract.CommonDataKinds.StructuredPostal.class;
                                    c75903fj.A00 = i2;
                                    c75903fj.A02 = str;
                                    c75903fj.A04 = c75893fi;
                                    c75903fj.A03 = str4;
                                    c75903fj.A05 = z5;
                                    list6.add(c75903fj);
                                }
                            }
                        } else if (str2.equals("ORG")) {
                            for (String str6 : c55392kL.A04) {
                                if (str6.equals("PREF") && !z4) {
                                    z4 = true;
                                }
                            }
                            c04110Ip.A0E(A01(c55392kL.A03), "");
                        } else if (str2.equals("TITLE")) {
                            c04110Ip.A0D(c55392kL.A02);
                        } else if (str2.equals("ROLE")) {
                            c04110Ip.A0D(c55392kL.A02);
                        } else if (str2.equals("PHOTO")) {
                            byte[] bytes = c55392kL.A02.getBytes();
                            c04110Ip.A09 = null;
                            if (bytes != null && bytes.length > 0) {
                                try {
                                    c04110Ip.A09 = Base64.decode(bytes, 0);
                                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException e) {
                                    Log.e("contactstruct/constructcontactfromvnode/base64-decode/error", e);
                                }
                            }
                        } else if (str2.equals("LOGO")) {
                            Log.e("name/LOGO/we_don't_support");
                        } else if (str2.equals("EMAIL")) {
                            String str7 = null;
                            boolean z6 = false;
                            for (String str8 : c55392kL.A04) {
                                if (str8.equals("PREF") && !z3) {
                                    z6 = true;
                                    z3 = true;
                                } else if (str8.equalsIgnoreCase("HOME")) {
                                    i2 = 1;
                                } else if (str8.equalsIgnoreCase("WORK")) {
                                    i2 = 2;
                                } else if (str8.equalsIgnoreCase("CELL")) {
                                    i2 = 4;
                                } else if (str8.toUpperCase(Locale.US).startsWith("X-")) {
                                    if (i2 < 0) {
                                        str7 = str8.substring(2);
                                        i2 = 0;
                                    }
                                } else if (i2 < 0) {
                                    str7 = str8;
                                    i2 = 0;
                                }
                            }
                            if (i2 < 0) {
                                i2 = 3;
                            }
                            c04110Ip.A0C(i2, c55392kL.A02, str7, z6);
                        } else if (str2.equals("TEL")) {
                            Iterator it3 = c55392kL.A04.iterator();
                            boolean z7 = false;
                            String str9 = "HOME";
                            boolean z8 = false;
                            int i3 = -1;
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                String str10 = (String) it3.next();
                                if (z8) {
                                    if (str10.equals("HOME")) {
                                        i3 = 5;
                                    } else if (str10.equals("WORK")) {
                                        i3 = 4;
                                    }
                                } else if (str10.equals("PREF") && !z) {
                                    z7 = true;
                                    z = true;
                                } else if (str10.equalsIgnoreCase("HOME")) {
                                    i3 = 1;
                                } else if (str10.equalsIgnoreCase("WORK")) {
                                    i3 = 3;
                                } else if (str10.equalsIgnoreCase("CELL")) {
                                    i3 = 2;
                                } else if (str10.equalsIgnoreCase("PAGER")) {
                                    i3 = 6;
                                } else if (str10.equalsIgnoreCase("FAX")) {
                                    z8 = true;
                                } else if (!str10.equalsIgnoreCase("VOICE") && !str10.equalsIgnoreCase("MSG")) {
                                    if (str10.toUpperCase(Locale.US).startsWith("X-")) {
                                        if (i3 < 0) {
                                            str10 = str10.substring(2);
                                            str9 = str10;
                                            i3 = 0;
                                        }
                                    } else if (i3 < 0) {
                                        str9 = str10;
                                        i3 = 0;
                                    }
                                }
                            }
                            if (i3 < 0) {
                                i3 = 1;
                            }
                            String asString = c55392kL.A00.getAsString("waId");
                            if (asString != null) {
                                try {
                                    fromIdentifier = UserJid.getFromIdentifier(asString);
                                } catch (C011305p unused) {
                                }
                                c04110Ip.A0A(i3, fromIdentifier, c55392kL.A02, str9, z7);
                            }
                            fromIdentifier = null;
                            c04110Ip.A0A(i3, fromIdentifier, c55392kL.A02, str9, z7);
                        } else if (str2.equals("NOTE")) {
                            c04110Ip.A03.add(c55392kL.A02);
                        } else if (str2.equals("BDAY")) {
                            String str11 = c55392kL.A02;
                            if (str11 != null && str11.startsWith("1604")) {
                                StringBuilder A0P = C000200d.A0P("-");
                                A0P.append(str11.substring(4));
                                c55392kL.A02 = A0P.toString();
                            }
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("URL")) {
                            String str12 = c55392kL.A02;
                            int i4 = -1;
                            for (String str13 : c55392kL.A04) {
                                if (str13.equalsIgnoreCase("BLOG")) {
                                    i4 = 2;
                                } else if (str13.equalsIgnoreCase("FTP")) {
                                    i4 = 6;
                                } else if (str13.equalsIgnoreCase("HOME")) {
                                    i4 = 4;
                                } else if (str13.equalsIgnoreCase("HOMEPAGE")) {
                                    i4 = 1;
                                } else if (str13.equalsIgnoreCase("OTHER")) {
                                    i4 = 7;
                                } else if (str13.equalsIgnoreCase("PROFILE")) {
                                    i4 = 3;
                                } else if (str13.equalsIgnoreCase("WORK")) {
                                    i4 = 5;
                                }
                            }
                            c04110Ip.A0B(i4, str12);
                        } else if (str2.equals("REV")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("UID")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("KEY")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("MAILER")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("TZ")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("GEO")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("NICKNAME")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("CLASS")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("PROFILE")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("CATEGORIES")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("SOURCE")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("PRODID")) {
                            c04110Ip.A0F(c55392kL);
                        } else if (str2.equals("X-PHONETIC-FIRST-NAME")) {
                            c04110Ip.A08.A04 = c55392kL.A02;
                        } else if (!str2.equals("X-PHONETIC-MIDDLE-NAME")) {
                            if (str2.equals("X-PHONETIC-LAST-NAME")) {
                                c04110Ip.A08.A05 = c55392kL.A02;
                            } else if (str2.equals("X-WA-BIZ-NAME")) {
                                c04110Ip.A08.A08 = c55392kL.A02;
                            } else if (str2.equals("X-WA-BIZ-DESCRIPTION")) {
                                c04110Ip.A01 = c55392kL.A02;
                            } else {
                                c04110Ip.A0F(c55392kL);
                            }
                        }
                    }
                }
            }
        }
        if (!z && (list4 = c04110Ip.A05) != null && list4.size() > 0) {
            ((C09010cT) c04110Ip.A05.get(0)).A04 = true;
        }
        if (!z2 && (list3 = c04110Ip.A02) != null) {
            Iterator it4 = list3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C75903fj c75903fj2 = (C75903fj) it4.next();
                if (c75903fj2.A01 == ContactsContract.CommonDataKinds.StructuredPostal.class) {
                    c75903fj2.A05 = true;
                    break;
                }
            }
        }
        if (!z3 && (list2 = c04110Ip.A02) != null) {
            Iterator it5 = list2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                C75903fj c75903fj3 = (C75903fj) it5.next();
                if (c75903fj3.A01 == ContactsContract.CommonDataKinds.Email.class) {
                    c75903fj3.A05 = true;
                    break;
                }
            }
        }
        if (!z4 && (list = c04110Ip.A04) != null && list.size() > 0) {
            ((C75923fl) c04110Ip.A04.get(0)).A02 = true;
        }
        c04110Ip.A09();
        return c04110Ip;
    }

    public static void A07(C75913fk c75913fk, List list) {
        int size = list.size();
        if (size > 1) {
            c75913fk.A00 = (String) list.get(0);
            c75913fk.A02 = (String) list.get(1);
            if (size > 2 && ((String) list.get(2)).length() > 0) {
                c75913fk.A03 = (String) list.get(2);
            }
            if (size > 3 && ((String) list.get(3)).length() > 0) {
                c75913fk.A06 = (String) list.get(3);
            }
            if (size <= 4 || ((String) list.get(4)).length() <= 0) {
                return;
            }
            c75913fk.A07 = (String) list.get(4);
        }
    }

    public String A08() {
        String str = this.A08.A01;
        if (str != null) {
            return str;
        }
        List list = this.A04;
        if (list != null && list.size() > 0) {
            return ((C75923fl) this.A04.get(0)).A00;
        }
        List list2 = this.A05;
        if (list2 != null && list2.size() > 0) {
            for (C09010cT c09010cT : this.A05) {
                if (c09010cT.A04) {
                    return c09010cT.A02;
                }
            }
        }
        List list3 = this.A02;
        if (list3 == null || list3.size() <= 0) {
            return "";
        }
        for (C75903fj c75903fj : this.A02) {
            if (c75903fj.A01 == ContactsContract.CommonDataKinds.Email.class && c75903fj.A05) {
                return c75903fj.A02;
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    public final void A09() {
        boolean z;
        HashMap hashMap;
        String str;
        String A02;
        String str2;
        String str3;
        String str4;
        List list = this.A05;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C09010cT c09010cT : this.A05) {
            if (c09010cT.A01 == null && (str4 = c09010cT.A02) != null) {
                int indexOf = str4.indexOf(44);
                if (indexOf != -1) {
                    str4 = str4.substring(0, indexOf);
                }
                arrayList.add(PhoneNumberUtils.stripSeparators(str4.trim()));
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass060 anonymousClass060 = this.A0B.A05;
        if (anonymousClass060 != null) {
            if (arrayList.isEmpty()) {
                hashMap = Collections.emptyMap();
            } else {
                C000700j.A07(arrayList.size() <= 10);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str5 = (String) it.next();
                    if (str5 != null) {
                        int length = str5.length();
                        z = true;
                        if (length <= 30) {
                            C000700j.A07(z);
                        }
                    }
                    z = false;
                    C000700j.A07(z);
                }
                HashMap hashMap2 = new HashMap(arrayList.size());
                StringBuilder A0P = C000200d.A0P("number IN (");
                int size = arrayList.size() - 1;
                StringBuilder sb = new StringBuilder(size * 3);
                for (int i = 0; i < size; i++) {
                    sb.append("?, ");
                }
                A0P.append(sb.toString());
                A0P.append("?)");
                try {
                    Cursor A05 = AnonymousClass061.A05(anonymousClass060.A0A(), "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", AnonymousClass060.A09, A0P.toString(), (String[]) arrayList.toArray(new String[0]), null, "CONTACTS");
                    if (A05 != null) {
                        while (A05.moveToNext()) {
                            UserJid nullable = UserJid.getNullable(A05.getString(0));
                            String string = A05.getString(1);
                            if (nullable != null && string != null) {
                                hashMap2.put(string, nullable);
                            }
                        }
                        A05.close();
                    }
                } finally {
                }
            }
            this.A0E.A03 = SystemClock.uptimeMillis() - uptimeMillis;
            for (C09010cT c09010cT2 : this.A05) {
                AbstractC005302j abstractC005302j = c09010cT2.A01;
                if (abstractC005302j == null) {
                    String str6 = c09010cT2.A02;
                    int indexOf2 = str6.indexOf(44);
                    if (indexOf2 != -1) {
                        str6 = str6.substring(0, indexOf2);
                    }
                    abstractC005302j = (AbstractC005302j) hashMap.get(PhoneNumberUtils.stripSeparators(str6.trim()));
                    if (abstractC005302j == null) {
                        A02 = c09010cT2.A02.trim();
                        c09010cT2.A02 = A02;
                    }
                }
                A02 = C04630Le.A02(abstractC005302j);
                if (A02 != null && (str2 = c09010cT2.A02) != null && c09010cT2.A01 == null) {
                    int indexOf3 = str2.indexOf(44);
                    if (indexOf3 != -1) {
                        str3 = str2.substring(indexOf3 + 1);
                    } else {
                        str3 = "";
                    }
                    String stripSeparators = PhoneNumberUtils.stripSeparators(str3.trim());
                    if (!TextUtils.isEmpty(stripSeparators)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(A02);
                        sb2.append(',');
                        sb2.append(stripSeparators);
                        A02 = sb2.toString();
                    }
                }
                c09010cT2.A02 = A02;
            }
            for (C09010cT c09010cT3 : this.A05) {
                if (c09010cT3.A00 == 0 && ((str = c09010cT3.A03) == null || str.equalsIgnoreCase("null"))) {
                    c09010cT3.A03 = this.A0C.A00.getString(R.string.no_phone_type);
                }
            }
            return;
        }
        throw null;
    }

    public void A0A(int i, UserJid userJid, String str, String str2, boolean z) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("contactstruct/addphone/data is null; skipping (type=");
            sb.append(i);
            sb.append(" jidFromWaId=");
            sb.append(userJid);
            sb.append(" label=");
            sb.append(str2);
            sb.append(" isPrimary=");
            sb.append(z);
            sb.append(")");
            Log.w(sb.toString());
        } else if (str.length() > 30) {
            this.A0E.A01++;
        } else {
            List list = this.A05;
            if (list == null) {
                list = new ArrayList();
                this.A05 = list;
            }
            if (list.size() >= 10) {
                this.A0E.A00++;
                return;
            }
            C09010cT c09010cT = new C09010cT();
            c09010cT.A00 = i;
            c09010cT.A01 = userJid;
            c09010cT.A02 = str;
            c09010cT.A03 = str2;
            c09010cT.A04 = z;
            this.A05.add(c09010cT);
        }
    }

    public void A0B(int i, String str) {
        List list = this.A06;
        if (list == null) {
            list = new ArrayList();
            this.A06 = list;
        }
        C75943fn c75943fn = new C75943fn();
        c75943fn.A00 = i;
        if (str != null) {
            c75943fn.A01 = str;
            list.add(c75943fn);
            return;
        }
        throw null;
    }

    public void A0C(int i, String str, String str2, boolean z) {
        List list = this.A02;
        if (list == null) {
            list = new ArrayList();
            this.A02 = list;
        }
        C75903fj c75903fj = new C75903fj();
        c75903fj.A01 = ContactsContract.CommonDataKinds.Email.class;
        c75903fj.A00 = i;
        c75903fj.A02 = str;
        c75903fj.A03 = str2;
        c75903fj.A05 = z;
        list.add(c75903fj);
    }

    public void A0D(String str) {
        List list = this.A04;
        if (list == null) {
            list = new ArrayList();
            this.A04 = list;
        }
        int size = list.size();
        if (size == 0) {
            A0E("", null);
            size = 1;
        }
        ((C75923fl) this.A04.get(size - 1)).A01 = str;
    }

    public void A0E(String str, String str2) {
        List list = this.A04;
        if (list == null) {
            list = new ArrayList();
            this.A04 = list;
        }
        C75923fl c75923fl = new C75923fl();
        c75923fl.A00 = str;
        c75923fl.A01 = str2;
        list.add(c75923fl);
    }

    public void A0F(C55392kL c55392kL) {
        List list;
        String str = c55392kL.A02;
        if (str != null && str.length() != 0) {
            String str2 = c55392kL.A01;
            Map map = this.A07;
            if (map == null) {
                map = new HashMap();
                this.A07 = map;
            }
            if (!map.containsKey(str2)) {
                list = new ArrayList();
                this.A07.put(str2, list);
            } else {
                list = (List) this.A07.get(str2);
            }
            list.add(c55392kL);
        }
    }
}
