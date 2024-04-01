package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.26W  reason: invalid class name */
/* loaded from: classes2.dex */
public class C26W {
    public static volatile C26W A03;
    public final C05W A00;
    public final C018808t A01;
    public final C451620q A02;

    public C26W(C05W c05w, C451620q c451620q, C018808t c018808t) {
        this.A00 = c05w;
        this.A02 = c451620q;
        this.A01 = c018808t;
    }

    public static C02590Ca A00(C20v c20v) {
        byte[] bArr;
        synchronized (c20v) {
            bArr = c20v.A0Q;
        }
        if (bArr == null) {
            bArr = c20v.A01();
        }
        return new C02590Ca("message", null, null, bArr);
    }

    public static void A01(String str, String str2, ArrayList arrayList) {
        arrayList.add(new C04P(str, str2, null, (byte) 0));
    }

    public static final void A02(List list, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        list.add(new C04P(str, str2, null, (byte) 0));
    }

    public static void A03(List list, List list2) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27I c27i = (C27I) it.next();
            AbstractC005302j abstractC005302j = c27i.A00;
            boolean A0b = C003101m.A0b(abstractC005302j);
            arrayList.clear();
            arrayList.add(new C04P("jid", abstractC005302j));
            if (!TextUtils.isEmpty(c27i.A0H)) {
                String str2 = c27i.A0H;
                if (str2 != null) {
                    arrayList.add(new C04P("notify", str2, null, (byte) 0));
                } else {
                    throw null;
                }
            }
            int i = ((C20v) c27i).A00;
            if (i != 0 && i != -1) {
                String str3 = c27i.A0G;
                if (str3 != null) {
                    arrayList.add(new C04P("name", str3, null, (byte) 0));
                    if (!c27i.A0L && A0b) {
                        arrayList.add(new C04P("type", "out", null, (byte) 0));
                    }
                }
                String str4 = c27i.A0I;
                if (str4 != null) {
                    arrayList.add(new C04P("vname", str4, null, (byte) 0));
                }
                if (c27i.A0O) {
                    arrayList.add(new C04P("status_mute", "true", null, (byte) 0));
                }
                if (i == 1) {
                    str = "0";
                } else if (i == 2) {
                    str = "1";
                } else if (i == 3) {
                    str = "2";
                }
                arrayList.add(new C04P("verify", str, null, (byte) 0));
                if (c27i.A0M) {
                    arrayList.add(new C04P("enterprise", "true", null, (byte) 0));
                }
            } else {
                String str5 = c27i.A0G;
                if (str5 != null) {
                    arrayList.add(new C04P("name", str5, null, (byte) 0));
                    if (!c27i.A0L && A0b) {
                        arrayList.add(new C04P("type", "out", null, (byte) 0));
                    }
                    String str6 = c27i.A0I;
                    if (str6 != null) {
                        arrayList.add(new C04P("short", str6, null, (byte) 0));
                    }
                    if (c27i.A0O) {
                        arrayList.add(new C04P("status_mute", "true", null, (byte) 0));
                    }
                }
            }
            list2.add(new C02590Ca("user", (C04P[]) arrayList.toArray(new C04P[arrayList.size()]), null, null));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public byte[] A04(C466127n c466127n, int i, List list, Map map, Map map2) {
        C04P[] c04pArr;
        C02590Ca c02590Ca;
        C02590Ca c02590Ca2;
        List list2;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                arrayList2.add(new C04P((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        String str2 = (String) map.get("web");
        String str3 = (String) map.get("stickerPack");
        String str4 = (String) map.get("recentStickers");
        String str5 = (String) map.get("starredStickers");
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 18:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C20v c20v = (C20v) it.next();
                    ArrayList arrayList3 = new ArrayList();
                    AbstractC005302j abstractC005302j = c20v.A0A;
                    if (abstractC005302j != null) {
                        arrayList3.add(new C04P("jid", abstractC005302j));
                        arrayList3.add(new C04P("count", Integer.toString(c20v.A01)));
                        String str6 = c20v.A0G;
                        if (str6 != null) {
                            A01("name", str6, arrayList3);
                        }
                        UserJid userJid = c20v.A0B;
                        if (userJid != null) {
                            C000200d.A0y("new_jid", userJid, arrayList3);
                        }
                        UserJid userJid2 = c20v.A0C;
                        if (userJid2 != null) {
                            C000200d.A0y("old_jid", userJid2, arrayList3);
                        }
                        long j = c20v.A08;
                        if (j != 0) {
                            arrayList3.add(new C04P("t", Long.toString(j / 1000)));
                        }
                        long j2 = c20v.A06;
                        if (j2 >= 0) {
                            arrayList3.add(new C04P("mute", Long.toString(j2 / 1000)));
                        } else if (j2 == -1) {
                            A01("mute", "-1", arrayList3);
                        }
                        if (c20v.A0L) {
                            A01("archive", "true", arrayList3);
                        }
                        if (c20v.A0P) {
                            A01("read_only", "true", arrayList3);
                        }
                        if (c20v.A0O) {
                            A01("message", "true", arrayList3);
                        }
                        int i2 = c20v.A03;
                        if (i2 > 0 && i2 < 1000000) {
                            arrayList3.add(new C04P("modify_tag", Integer.toString(i2)));
                        }
                        if (c20v.A0N) {
                            A01("spam", "false", arrayList3);
                        }
                        long j3 = c20v.A07;
                        if (j3 > 0) {
                            arrayList3.add(new C04P("pin", String.valueOf(j3 / 1000)));
                        }
                        int i3 = c20v.A00;
                        if (i3 == 1) {
                            A01("type", "clear", arrayList3);
                        } else if (i3 == 2) {
                            A01("type", "delete", arrayList3);
                        } else if (i3 == 3) {
                            A01("type", "ahead", arrayList3);
                        }
                        int i4 = c20v.A02;
                        if (i4 > 0) {
                            arrayList3.add(new C04P("ephemeral", Integer.toString(i4)));
                        }
                        long j4 = c20v.A05;
                        if (j4 > 0) {
                            arrayList3.add(new C04P("eph_setting_ts", Long.toString(j4)));
                        }
                        arrayList.add(new C02590Ca("chat", (C04P[]) arrayList3.toArray(new C04P[arrayList3.size()])));
                    } else {
                        throw null;
                    }
                }
                arrayList2.add(new C04P("type", 6 == i ? "resume" : "chat"));
                if (6 == i) {
                    if (str2 != null) {
                        A01("checksum", str2, arrayList2);
                    }
                    if (str3 != null) {
                        A01("sticker_pack", str3, arrayList2);
                    }
                    if (str4 != null) {
                        A01("recent_stickers", str4, arrayList2);
                    }
                    if (str5 != null) {
                        A01("starred_stickers", str5, arrayList2);
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 1:
            case 3:
            case 25:
            case 26:
            case 35:
            case 41:
            default:
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 2:
            case 8:
                A03(list, arrayList);
                A01("type", "contacts", arrayList2);
                if (str2 != null) {
                    A01("checksum", str2, arrayList2);
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 4:
            case 19:
            case C0M6.A01 /* 20 */:
            case 23:
            case 24:
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(A00((C20v) it2.next()));
                }
                if (i != 19) {
                    if (i == 20) {
                        str = "star";
                    } else if (i == 23) {
                        str = "media_message";
                    } else if (i != 24) {
                        str = "message";
                    } else {
                        A01("last", "true", arrayList2);
                    }
                    A01("type", str, arrayList2);
                    c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                    break;
                }
                str = "search";
                A01("type", str, arrayList2);
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
            case 5:
                arrayList2.add(new C04P("type", "media"));
                if (list.size() == 1) {
                    C27g c27g = (C27g) list.get(0);
                    int i5 = ((C20v) c27g).A00;
                    if (i5 == 200) {
                        String str7 = c27g.A02;
                        if (str7 != null) {
                            A01("url", str7, arrayList2);
                        }
                        byte[] bArr = c27g.A0R;
                        if (bArr != null) {
                            arrayList2.add(new C04P("media_key", Base64.encodeToString(bArr, 3)));
                        }
                        String str8 = c27g.A00;
                        if (!TextUtils.isEmpty(str8)) {
                            arrayList2.add(new C04P("direct_path", str8));
                        }
                        String str9 = c27g.A01;
                        if (!TextUtils.isEmpty(str9)) {
                            arrayList2.add(new C04P("enc_filehash", str9));
                        }
                    } else if (i5 != 400 && i5 != 404 && i5 != 502) {
                        A01("code", "404", arrayList2);
                    }
                    arrayList2.add(new C04P("code", Integer.toString(((C20v) c27g).A00)));
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 9:
                arrayList2.add(new C04P("type", "chat"));
                arrayList2.add(new C04P("duplicate", "true"));
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 10:
                arrayList2.add(new C04P("type", "contacts"));
                arrayList2.add(new C04P("duplicate", "true"));
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C465427f c465427f = (C465427f) it3.next();
                    ArrayList arrayList4 = new ArrayList();
                    List<C465027b> list3 = c465427f.A04;
                    for (C465027b c465027b : list3) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(new C04P("index", c465027b.A02));
                        arrayList5.add(new C04P("owner", c465027b.A03 ? "true" : "false"));
                        arrayList5.add(new C04P("status", Integer.toString(c465027b.A00)));
                        long j5 = c465027b.A01;
                        if (j5 != 0) {
                            arrayList5.add(new C04P("t", j5));
                        }
                        arrayList4.add(new C02590Ca("item", (C04P[]) arrayList5.toArray(new C04P[0])));
                    }
                    List<AnonymousClass092> list4 = c465427f.A03;
                    for (AnonymousClass092 anonymousClass092 : list4) {
                        arrayList4.add(this.A02.A02(anonymousClass092));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(new C04P("jid", c465427f.A02));
                    if (list3.size() > 0) {
                        arrayList6.add(new C04P("t", Long.toString(c465427f.A01 / 1000)));
                    }
                    if (list4.size() > 0) {
                        arrayList6.add(new C04P("pay_t", Long.toString(c465427f.A00 / 1000)));
                    }
                    arrayList.add(new C02590Ca("receipt", (C04P[]) arrayList6.toArray(new C04P[0]), (C02590Ca[]) arrayList4.toArray(new C02590Ca[0]), null));
                }
                A01("type", "receipt", arrayList2);
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 12:
                arrayList2.add(new C04P("type", "group"));
                if (list.size() == 1) {
                    C465327e c465327e = (C465327e) list.get(0);
                    if (c465327e.A0A == null && c465327e.A08 == 0 && ((list2 = c465327e.A0J) == null || list2.size() == 0)) {
                        c02590Ca2 = new C02590Ca("group", new C04P[]{new C04P("type", "missing")});
                    } else {
                        List list5 = c465327e.A0J;
                        int size = list5 == null ? 0 : list5.size();
                        ArrayList arrayList7 = new ArrayList();
                        for (int i6 = 0; i6 < size; i6++) {
                            C20v c20v2 = (C20v) c465327e.A0J.get(i6);
                            boolean z = c20v2.A0L;
                            C04P[] c04pArr2 = new C04P[z ? 2 : 1];
                            c04pArr2[0] = new C04P("jid", c20v2.A0A);
                            if (z) {
                                c04pArr2[1] = new C04P("type", "admin");
                            }
                            arrayList7.add(new C02590Ca("participant", c04pArr2));
                        }
                        AbstractC005302j abstractC005302j2 = c465327e.A0A;
                        if (abstractC005302j2 != null) {
                            if (this.A01.A02(abstractC005302j2)) {
                                arrayList7.add(new C02590Ca("support", null));
                            }
                            C06C A0A = this.A00.A0A(c465327e.A0A);
                            C04410Kb c04410Kb = A0A.A0B;
                            if (c04410Kb != null && !TextUtils.isEmpty(c04410Kb.A02)) {
                                arrayList7.add(new C02590Ca("description", (C04P[]) null, A0A.A0B.A02));
                            }
                            ArrayList arrayList8 = new ArrayList();
                            AbstractC005302j abstractC005302j3 = c465327e.A0A;
                            if (abstractC005302j3 != null) {
                                arrayList8.add(new C04P("creator", abstractC005302j3));
                            }
                            long j6 = c465327e.A08;
                            if (j6 != 0) {
                                arrayList8.add(new C04P("create", Long.toString(j6 / 1000)));
                            }
                            String str10 = c465327e.A00;
                            if (str10 != null) {
                                A01("kind", str10, arrayList8);
                            }
                            c02590Ca2 = new C02590Ca("group", (C04P[]) arrayList8.toArray(new C04P[arrayList8.size()]), (C02590Ca[]) arrayList7.toArray(new C02590Ca[arrayList7.size()]), null);
                        } else {
                            throw null;
                        }
                    }
                    arrayList.add(c02590Ca2);
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 13:
                arrayList2.add(new C04P("type", "preview"));
                if (list.size() == 1) {
                    C465227d c465227d = (C465227d) list.get(0);
                    String str11 = c465227d.A00;
                    C04P[] c04pArr3 = new C04P[1];
                    if (str11 == null) {
                        c04pArr3[0] = new C04P("type", "missing");
                    } else {
                        c04pArr3[0] = new C04P("id", str11);
                    }
                    arrayList.add(new C02590Ca("preview", c04pArr3, str11 == null ? null : c465227d.A01));
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 14:
                arrayList2.add(new C04P("type", "action"));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    C20v c20v3 = (C20v) it4.next();
                    arrayList.add(new C02590Ca("item", new C04P[]{new C04P("id", c20v3.A0D), new C04P("code", Integer.toString(c20v3.A00))}));
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 15:
                arrayList2.add(new C04P("type", "action"));
                arrayList2.add(new C04P("replaced", "true"));
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                arrayList2.add(new C04P("type", "emoji"));
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    C465127c c465127c = (C465127c) ((C20v) it5.next());
                    arrayList.add(new C02590Ca("item", new C04P[]{new C04P("code", c465127c.A0D), new C04P("value", Float.toString(c465127c.A00))}));
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 17:
                arrayList2.add(new C04P("type", "message_info"));
                if (list.size() == 1) {
                    C464927a c464927a = (C464927a) list.get(0);
                    arrayList2.add(new C04P("count", Integer.toString(c464927a.A00)));
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    int i7 = 0;
                    while (true) {
                        List list6 = c464927a.A01;
                        if (i7 < list6.size()) {
                            C465027b c465027b2 = (C465027b) list6.get(i7);
                            C02590Ca c02590Ca3 = new C02590Ca("item", new C04P[]{new C04P("jid", c465027b2.A02), new C04P("t", Long.toString(c465027b2.A01 / 1000))});
                            int i8 = c465027b2.A00;
                            if (i8 == 2) {
                                arrayList9.add(c02590Ca3);
                            } else if (i8 == 3) {
                                arrayList10.add(c02590Ca3);
                            } else if (i8 == 4) {
                                arrayList11.add(c02590Ca3);
                            }
                            i7++;
                        } else {
                            if (!arrayList9.isEmpty()) {
                                arrayList.add(new C02590Ca("delivery", null, (C02590Ca[]) arrayList9.toArray(new C02590Ca[arrayList9.size()]), null));
                            }
                            if (!arrayList10.isEmpty()) {
                                arrayList.add(new C02590Ca("read", null, (C02590Ca[]) arrayList10.toArray(new C02590Ca[arrayList10.size()]), null));
                            }
                            if (!arrayList11.isEmpty()) {
                                arrayList.add(new C02590Ca("played", null, (C02590Ca[]) arrayList11.toArray(new C02590Ca[arrayList11.size()]), null));
                            }
                        }
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 21:
                if (list.size() == 1) {
                    arrayList2.add(new C04P("type", "identity"));
                    C27Z c27z = (C27Z) list.get(0);
                    arrayList.add(new C02590Ca("raw", (C04P[]) null, c27z.A01));
                    arrayList.add(new C02590Ca("text", (C04P[]) null, c27z.A00));
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 22:
                if (list.size() == 1) {
                    arrayList2.add(new C04P("type", "url"));
                    C27Y c27y = (C27Y) list.get(0);
                    String str12 = c27y.A04;
                    if (str12 != null) {
                        A01("title", str12, arrayList2);
                    }
                    String str13 = c27y.A01;
                    if (str13 != null) {
                        A01("description", str13, arrayList2);
                    }
                    String str14 = c27y.A00;
                    if (str14 != null) {
                        A01("canonical-url", str14, arrayList2);
                    }
                    String str15 = c27y.A02;
                    if (str15 != null) {
                        A01("matched-text", str15, arrayList2);
                    }
                    String str16 = c27y.A03;
                    if (str16 != null) {
                        A01("preview", str16, arrayList2);
                    }
                    byte[] bArr2 = c27y.A05;
                    if (bArr2 != null) {
                        c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), bArr2);
                        break;
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 27:
                arrayList2.add(new C04P("type", "status"));
                if (str2 != null) {
                    arrayList2.add(new C04P("checksum", str2));
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        C27X c27x = (C27X) ((C20v) it6.next());
                        ArrayList arrayList12 = new ArrayList();
                        arrayList12.add(new C04P("jid", c27x.A03));
                        arrayList12.add(new C04P("unread", String.valueOf(c27x.A01)));
                        arrayList12.add(new C04P("count", String.valueOf(c27x.A00)));
                        arrayList12.add(new C04P("t", String.valueOf(c27x.A08)));
                        ArrayList arrayList13 = new ArrayList();
                        byte[] bArr3 = c27x.A02;
                        if (bArr3 != null && bArr3.length > 0) {
                            arrayList13.add(new C02590Ca("picture", (C04P[]) null, bArr3));
                        }
                        List<C20v> list7 = c27x.A0K;
                        if (list7 != null) {
                            for (C20v c20v4 : list7) {
                                arrayList13.add(A00(c20v4));
                            }
                        }
                        arrayList.add(new C02590Ca("status", (C04P[]) arrayList12.toArray(new C04P[arrayList12.size()]), (C02590Ca[]) arrayList13.toArray(new C02590Ca[arrayList13.size()]), null));
                    }
                    c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                    break;
                } else {
                    throw null;
                }
                break;
            case 28:
                arrayList2.add(new C04P("type", "status"));
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    arrayList.add(A00((C20v) it7.next()));
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 29:
                A01("type", "location", arrayList2);
                if (list != null && !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        C21N c21n = (C21N) ((C20v) it8.next());
                        ArrayList arrayList14 = new ArrayList(3);
                        arrayList14.add(new C04P("jid", c21n.A0A));
                        arrayList14.add(new C04P("expiration", String.valueOf(c21n.A01)));
                        long j7 = c21n.A00;
                        if (j7 >= 0) {
                            arrayList14.add(new C04P("elapsed", String.valueOf(j7)));
                        }
                        arrayList.add(new C02590Ca("participant", (C04P[]) arrayList14.toArray(new C04P[arrayList14.size()]), c21n.A02));
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 30:
                if (list.size() == 1) {
                    arrayList2.add(new C04P("type", "call"));
                    arrayList2.add(new C04P("code", String.valueOf(((C27W) list.get(0)).A00)));
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 31:
                arrayList2.add(new C04P("type", "quick_reply"));
                arrayList2.add(new C04P("checksum", str2));
                if (list != null && !list.isEmpty()) {
                    Iterator it9 = list.iterator();
                    if (it9.hasNext()) {
                        it9.next();
                        throw null;
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                arrayList2.add(new C04P("type", "quick_reply"));
                arrayList2.add(new C04P("checksum", str2));
                if (list != null && !list.isEmpty()) {
                    Iterator it10 = list.iterator();
                    if (it10.hasNext()) {
                        it10.next();
                        throw null;
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 33:
                arrayList2.add(new C04P("type", "label"));
                arrayList2.add(new C04P("checksum", str2));
                if (list != null && !list.isEmpty()) {
                    Iterator it11 = list.iterator();
                    if (it11.hasNext()) {
                        it11.next();
                        throw null;
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 34:
                if (list.size() == 1) {
                    C27U c27u = (C27U) list.get(0);
                    arrayList2.add(new C04P("type", "call-offer"));
                    int i9 = c27u.A00;
                    arrayList2.add(new C04P("code", String.valueOf(i9)));
                    if (i9 == 200) {
                        C0Mt c0Mt = c27u.A01;
                        if (c0Mt != null) {
                            ArrayList arrayList15 = new ArrayList(6);
                            C27V c27v = c0Mt.A01;
                            if (c27v.A06) {
                                arrayList15.add(new C04P("offline", "1", null, (byte) 0));
                            }
                            arrayList15.add(new C04P("e", String.valueOf(c27v.A00 / 1000), null, (byte) 0));
                            arrayList15.add(new C04P("t", String.valueOf(c27v.A01 / 1000), null, (byte) 0));
                            Jid jid = ((C04990Mu) c27v).A00;
                            if (jid instanceof DeviceJid) {
                                jid = ((DeviceJid) jid).userJid;
                            }
                            arrayList15.add(new C04P("from", jid));
                            String str17 = c27v.A05;
                            if (str17 != null) {
                                arrayList15.add(new C04P("platform", str17, null, (byte) 0));
                            }
                            String str18 = c27v.A04;
                            if (str18 != null) {
                                arrayList15.add(new C04P("version", str18, null, (byte) 0));
                            }
                            VoipStanzaChildNode voipStanzaChildNode = ((C04990Mu) c27v).A01;
                            VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
                            if (childrenCopy != null) {
                                ArrayList arrayList16 = new ArrayList();
                                for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                                    if ("enc".equals(voipStanzaChildNode2.tag)) {
                                        byte[] bArr4 = c0Mt.A04;
                                        if (bArr4 != null) {
                                            arrayList16.add(C40581sV.A04(bArr4));
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        arrayList16.add(voipStanzaChildNode2.toProtocolTreeNode());
                                    }
                                }
                                arrayList.add(new C02590Ca("call", (C04P[]) arrayList15.toArray(new C04P[0]), new C02590Ca(voipStanzaChildNode.tag, voipStanzaChildNode.getAttributesCopy(), (C02590Ca[]) arrayList16.toArray(new C02590Ca[0]), null)));
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 36:
            case 37:
                arrayList2.add(new C04P("type", "label"));
                arrayList2.add(new C04P("kind", "color"));
                if (list != null && !list.isEmpty()) {
                    Iterator it12 = list.iterator();
                    if (it12.hasNext()) {
                        it12.next();
                        throw null;
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 38:
                if (list.size() == 1) {
                    C27S c27s = (C27S) list.get(0);
                    arrayList2.add(new C04P("type", "sticker_pack"));
                    String str19 = c27s.A00;
                    if (str19 != null) {
                        arrayList2.add(new C04P("checksum", str19));
                        arrayList2.add(new C04P("count", Integer.toString(((C20v) c27s).A01)));
                        List<C27T> list8 = c27s.A01;
                        if (list8 != null) {
                            for (C27T c27t : list8) {
                                arrayList.add(new C02590Ca("sticker_pack", new C04P[]{new C04P("id", c27t.A00), new C04P("mimetype", c27t.A01), new C04P("name", c27t.A02), new C04P("url", c27t.A03)}));
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 39:
                if (list.size() == 1) {
                    A01("type", "sticker", arrayList2);
                    for (C04980Ms c04980Ms : ((C27R) list.get(0)).A01) {
                        arrayList.add(c04980Ms.A01(false));
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 40:
                if (list.size() == 1) {
                    arrayList2.add(new C04P("type", "video"));
                    arrayList2.add(new C04P("url", ((C27Q) list.get(0)).A00));
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 42:
                if (list.size() == 1) {
                    C27O c27o = (C27O) list.get(0);
                    arrayList2.add(new C04P("type", "sticker_pack"));
                    String str20 = c27o.A00;
                    if (str20 != null) {
                        arrayList2.add(new C04P("checksum", str20));
                        arrayList2.add(new C04P("count", Integer.toString(((C20v) c27o).A01)));
                        List<C27P> list9 = c27o.A01;
                        if (list9 != null) {
                            for (C27P c27p : list9) {
                                ArrayList arrayList17 = new ArrayList();
                                arrayList17.add(new C04P("id", c27p.A03));
                                arrayList17.add(new C04P("name", c27p.A06));
                                arrayList17.add(new C04P("mimetype", c27p.A05));
                                A02(arrayList17, "url", c27p.A07);
                                A02(arrayList17, "filehash", c27p.A02);
                                A02(arrayList17, "media_key", c27p.A04);
                                A02(arrayList17, "direct_path", c27p.A00);
                                A02(arrayList17, "enc_filehash", c27p.A01);
                                arrayList.add(new C02590Ca("sticker_pack", (C04P[]) arrayList17.toArray(new C04P[arrayList17.size()])));
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 43:
                arrayList2.add(new C04P("type", "media"));
                if (list.size() == 1) {
                    C27N c27n = (C27N) list.get(0);
                    int i10 = ((C20v) c27n).A00;
                    arrayList2.add(new C04P("code", Integer.toString(i10)));
                    if (i10 == 200) {
                        String str21 = c27n.A07;
                        if (str21 != null) {
                            A01("url", str21, arrayList2);
                        }
                        byte[] bArr5 = c27n.A0R;
                        if (bArr5 != null) {
                            arrayList2.add(new C04P("media_key", Base64.encodeToString(bArr5, 3)));
                        }
                        String str22 = c27n.A03;
                        if (!TextUtils.isEmpty(str22)) {
                            arrayList2.add(new C04P("direct_path", str22));
                        }
                        String str23 = c27n.A04;
                        if (!TextUtils.isEmpty(str23)) {
                            arrayList2.add(new C04P("enc_filehash", str23));
                        }
                        arrayList2.add(new C04P("filehash", c27n.A05));
                        arrayList2.add(new C04P("mimetype", c27n.A06));
                        arrayList2.add(new C04P("width", String.valueOf(c27n.A01)));
                        arrayList2.add(new C04P("height", String.valueOf(c27n.A00)));
                        arrayList2.add(new C04P("size", String.valueOf(c27n.A02)));
                        arrayList2.add(new C04P("code", Integer.toString(((C20v) c27n).A00)));
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 44:
                if (list.size() == 1) {
                    C27M c27m = (C27M) list.get(0);
                    arrayList2.add(new C04P("type", "recent_stickers"));
                    String str24 = c27m.A00;
                    if (str24 != null) {
                        arrayList2.add(new C04P("checksum", str24));
                        for (C04980Ms c04980Ms2 : c27m.A01) {
                            arrayList.add(c04980Ms2.A01(true));
                        }
                    } else {
                        throw null;
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 45:
                if (list.size() == 1) {
                    C27L c27l = (C27L) list.get(0);
                    arrayList2.add(new C04P("type", "starred_stickers"));
                    arrayList2.add(new C04P("checksum", c27l.A01));
                    arrayList2.add(new C04P("total", c27l.A00));
                    for (C04980Ms c04980Ms3 : c27l.A02) {
                        arrayList.add(c04980Ms3.A01(false));
                    }
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                arrayList2.add(new C04P("type", "notice"));
                if (list.size() == 1) {
                    C27K c27k = (C27K) list.get(0);
                    c04pArr = new C04P[3];
                    c04pArr[0] = new C04P("id", c27k.A00);
                    c04pArr[1] = new C04P("blocking", c27k.A02 ? "true" : "false");
                    c04pArr[2] = new C04P("version", c27k.A01);
                } else {
                    c04pArr = null;
                }
                arrayList.add(new C02590Ca("notice", c04pArr));
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
            case 47:
                arrayList2.add(new C04P("type", "settings"));
                if (list.size() == 1) {
                    C27J c27j = (C27J) list.get(0);
                    C04P[] c04pArr4 = new C04P[2];
                    c04pArr4[0] = new C04P("enabled", c27j.A00 ? "true" : "false");
                    c04pArr4[1] = new C04P("classic", c27j.A01 ? "true" : "false");
                    arrayList.add(new C02590Ca("archive_v2", c04pArr4));
                }
                c02590Ca = new C02590Ca("response", (C04P[]) arrayList2.toArray(new C04P[arrayList2.size()]), (C02590Ca[]) arrayList.toArray(new C02590Ca[arrayList.size()]), null);
                break;
        }
        return c466127n.A0B(c02590Ca);
    }
}
