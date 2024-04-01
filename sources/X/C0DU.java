package X;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.0DU */
/* loaded from: classes.dex */
public final class C0DU {
    public static final HashMap A0D = new HashMap();
    public static final String[] A0E = {"_id"};
    public static volatile C0DU A0F;
    public HashMap A00 = new HashMap();
    public final C0LM A01;
    public final C06K A02;
    public final C05W A03;
    public final C018708s A04;
    public final C02E A05;
    public final C001200o A06;
    public final C002301c A07;
    public final C0C8 A08;
    public final C02980Dr A09;
    public final C03750Gx A0A;
    public final C02O A0B;
    public final C0CB A0C;

    public C0DU(C001200o c001200o, C02980Dr c02980Dr, C03750Gx c03750Gx, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C0CB c0cb, C06K c06k, C0C8 c0c8, C02O c02o, C0LM c0lm) {
        this.A06 = c001200o;
        this.A09 = c02980Dr;
        this.A0A = c03750Gx;
        this.A03 = c05w;
        this.A05 = c02e;
        this.A04 = c018708s;
        this.A07 = c002301c;
        this.A0C = c0cb;
        this.A02 = c06k;
        this.A08 = c0c8;
        this.A0B = c02o;
        this.A01 = c0lm;
    }

    public static C005402l A00(Context context) {
        C005402l c005402l = new C005402l(context, null);
        c005402l.A00 = C02160Ac.A00(context, R.color.primary_notification);
        return c005402l;
    }

    public static C0DU A01() {
        if (A0F == null) {
            synchronized (C0DU.class) {
                if (A0F == null) {
                    C001200o c001200o = C001200o.A01;
                    C02980Dr A00 = C02980Dr.A00();
                    AbstractC000600i.A00();
                    A0F = new C0DU(c001200o, A00, C03750Gx.A02(), C05W.A00(), C02E.A00(), C018708s.A00(), C002301c.A00(), C0CB.A00(), C06K.A00(), C0C8.A00(), C02O.A00(), C0LM.A00());
                }
            }
        }
        return A0F;
    }

    public static CharSequence A02(C02E c02e, C02O c02o, C001200o c001200o, C002301c c002301c, AnonymousClass092 anonymousClass092) {
        int i;
        int i2;
        String A08 = A08(anonymousClass092);
        if (anonymousClass092 instanceof C09D) {
            A08 = A0A(A08, "①", c001200o.A00.getString(R.string.view_once_photo));
        } else if (anonymousClass092 instanceof C09A) {
            A08 = A0A(A08, "①", c001200o.A00.getString(R.string.view_once_video));
        } else if (anonymousClass092 instanceof InterfaceC03910Hq) {
            A08 = ((InterfaceC03910Hq) anonymousClass092).ABd(c002301c);
        } else if (anonymousClass092 instanceof C04160Iu) {
            A08 = A0A(A08, "🛒", c001200o.A00.getString(R.string.conversations_most_recent_product));
        } else if (anonymousClass092 instanceof C0LN) {
            A08 = A0A(((C0LN) anonymousClass092).A1H(c001200o.A00, c002301c), "🛒", c001200o.A00.getString(R.string.conversations_most_recent_cart));
        } else if (anonymousClass092 instanceof AnonymousClass095) {
            A08 = A0A(A08, "📷", c001200o.A00.getString(R.string.conversations_most_recent_image));
        } else if (anonymousClass092 instanceof C09G) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
            StringBuilder sb = new StringBuilder();
            int i3 = ((AnonymousClass092) anonymousClass097).A04;
            StringBuilder A0P = C000200d.A0P(C000200d.A0L(sb, i3 == 1 ? "🎤" : "🎵", " "));
            Application application = c001200o.A00;
            int i4 = R.string.conversations_most_recent_audio;
            if (i3 == 1) {
                i4 = R.string.conversations_most_recent_voice;
            }
            A0P.append(application.getString(i4));
            A08 = A0P.toString();
            int i5 = anonymousClass097.A00;
            if (i5 != 0) {
                StringBuilder A0V = C000200d.A0V(A08, " (");
                A0V.append(AnonymousClass029.A0g(c002301c, i5));
                A0V.append(")");
                A08 = A0V.toString();
            }
        } else if (anonymousClass092 instanceof C0LO) {
            A08 = A0A(A08, "👾", c001200o.A00.getString(R.string.conversations_most_recent_gif));
        } else if (anonymousClass092 instanceof C0JP) {
            A08 = A0A(A08, "🎥", c001200o.A00.getString(R.string.conversations_most_recent_video));
            int i6 = ((AnonymousClass097) anonymousClass092).A00;
            if (i6 != 0) {
                StringBuilder A0V2 = C000200d.A0V(A08, " (");
                A0V2.append(AnonymousClass029.A0g(c002301c, i6));
                A0V2.append(")");
                A08 = A0V2.toString();
            }
        } else if (anonymousClass092 instanceof C09E) {
            C09E c09e = (C09E) anonymousClass092;
            if (C0DB.A0d(c09e)) {
                String A1B = c09e.A1B();
                C09H c09h = ((AnonymousClass097) c09e).A02;
                if (c09h != null) {
                    i2 = c09h.A01;
                } else {
                    i2 = 0;
                }
                if (!TextUtils.isEmpty(A1B)) {
                    StringBuilder A0P2 = C000200d.A0P("👤 ");
                    A0P2.append(AnonymousClass024.A0K(A1B, 128));
                    A08 = A0P2.toString();
                } else if (i2 == 1) {
                    StringBuilder A0P3 = C000200d.A0P("👤 ");
                    A0P3.append(c001200o.A00.getString(R.string.conversations_most_recent_contact));
                    A08 = A0P3.toString();
                } else {
                    StringBuilder A0P4 = C000200d.A0P("👤 ");
                    A0P4.append(c002301c.A0A(R.plurals.n_contacts_message_title, i2, Integer.valueOf(i2)));
                    A08 = A0P4.toString();
                }
            } else {
                if (TextUtils.isEmpty(A08)) {
                    A08 = c09e.A1B();
                }
                A08 = A0A(A08, "📄", c001200o.A00.getString(R.string.conversations_most_recent_document));
                if (c09e.A00 != 0) {
                    StringBuilder A0V3 = C000200d.A0V(A08, " (");
                    A0V3.append(C460324r.A08(c002301c, c09e));
                    A0V3.append(")");
                    A08 = A0V3.toString();
                }
            }
        } else if (anonymousClass092 instanceof C04040Ie) {
            StringBuilder A0P5 = C000200d.A0P("💟 ");
            A0P5.append(c001200o.A00.getString(R.string.conversations_most_recent_sticker));
            A08 = A0P5.toString();
        } else if (anonymousClass092 instanceof C04570Ky) {
            StringBuilder A0P6 = C000200d.A0P("👥 ");
            A0P6.append(c001200o.A00.getString(R.string.conversations_most_recent_group_invite));
            A08 = A0P6.toString();
        } else if (anonymousClass092 instanceof C0DA) {
            StringBuilder A0P7 = C000200d.A0P("👤 ");
            A0P7.append(C0Ho.A09(c002301c, (C0DA) anonymousClass092));
            A08 = A0P7.toString();
        } else if (anonymousClass092 instanceof C0D8) {
            C0D8 c0d8 = (C0D8) anonymousClass092;
            if (!TextUtils.isEmpty(c0d8.A00)) {
                StringBuilder A0P8 = C000200d.A0P("👤 ");
                A0P8.append(AnonymousClass024.A0K(c0d8.A00, 128));
                A08 = A0P8.toString();
            } else {
                StringBuilder A0P9 = C000200d.A0P("👤 ");
                A0P9.append(c001200o.A00.getString(R.string.conversations_most_recent_contact));
                A08 = A0P9.toString();
            }
        } else if (anonymousClass092 instanceof C0LP) {
            if (TextUtils.isEmpty(A08)) {
                A08 = ((C0LP) anonymousClass092).A01;
            }
            A08 = A0A(A08, "📌", c001200o.A00.getString(R.string.conversations_most_recent_location));
        } else if (anonymousClass092 instanceof C0KC) {
            A08 = A0A(A08, "📌", c001200o.A00.getString(R.string.conversations_most_recent_live_location));
        } else if (anonymousClass092 instanceof C04280Jo) {
            int A1B2 = ((C04280Jo) anonymousClass092).A1B();
            if (A1B2 == 0) {
                i = R.string.conversations_most_recent_voice_call_missed;
            } else if (A1B2 == 1) {
                i = R.string.conversations_most_recent_video_call_missed;
            } else if (A1B2 == 2) {
                i = R.string.conversations_most_recent_group_voice_call_missed;
            } else if (A1B2 != 3) {
                StringBuilder sb2 = new StringBuilder("unknown call type ");
                sb2.append(A1B2);
                C000700j.A08(false, sb2.toString());
                i = R.string.conversations_most_recent_voice_call_missed;
            } else {
                i = R.string.conversations_most_recent_group_video_call_missed;
            }
            A08 = c001200o.A00.getString(i);
        } else if (C0Ho.A0N(anonymousClass092)) {
            AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
            Application application2 = c001200o.A00;
            if (anonymousClass093 != null) {
                int i7 = anonymousClass093.A02;
                int i8 = R.string.notification_future_payment;
                if (i7 != 5) {
                    i8 = R.string.payment;
                }
                A08 = application2.getString(i8);
            } else {
                A08 = application2.getString(R.string.conversations_most_recent_decryption_failure);
            }
        } else if (anonymousClass092 instanceof C0KT) {
            AnonymousClass093 anonymousClass0932 = anonymousClass092.A0F;
            if (anonymousClass0932 != null && anonymousClass0932.A02 != 5) {
                A08 = c001200o.A00.getString(R.string.payment);
            } else {
                A08 = c001200o.A00.getString(R.string.notification_future_message);
            }
        } else if (anonymousClass092 instanceof C03890Hn) {
            Application application3 = c001200o.A00;
            boolean z = anonymousClass092.A0n.A02;
            int i9 = R.string.revoked_msg_incoming;
            if (z) {
                i9 = R.string.revoked_msg_outgoing;
            }
            A08 = application3.getString(i9);
        } else if (anonymousClass092 instanceof C0LQ) {
            Application application4 = c001200o.A00;
            boolean z2 = anonymousClass092.A0n.A02;
            int i10 = R.string.payment_my_request_declined;
            if (z2) {
                i10 = R.string.payment_request_declined_by_me;
            }
            A08 = application4.getString(i10);
        } else if (anonymousClass092 instanceof C0LS) {
            Application application5 = c001200o.A00;
            boolean z3 = anonymousClass092.A0n.A02;
            int i11 = R.string.payment_request_canceled;
            if (z3) {
                i11 = R.string.payment_request_canceled_by_me;
            }
            A08 = application5.getString(i11);
        } else if (anonymousClass092 instanceof C0LT) {
            A08 = c001200o.A00.getString(R.string.payments_send_payment_invitee_notification_text);
        } else if (!(anonymousClass092 instanceof C0LU)) {
            A08 = c001200o.A00.getString(R.string.conversations_most_recent_unknown);
        }
        return AnonymousClass024.A09(AnonymousClass029.A0Q(c02e, c02o, C002701i.A0p(A09(A08))));
    }

    public static CharSequence A03(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }

    public static CharSequence A04(CharSequence charSequence, boolean z) {
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new StyleSpan(2), 0, charSequence.length(), 0);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public static Integer A05(String str) {
        int i;
        if (str != null) {
            try {
                i = Integer.parseInt(str, 16);
            } catch (NumberFormatException unused) {
                i = 16777215;
            }
            int i2 = i | (-16777216);
            if (i2 != -16777216) {
                return Integer.valueOf(i2);
            }
            return null;
        }
        return null;
    }

    public static String A06(int i) {
        String hexString = Integer.toHexString(16777215 & i);
        int length = hexString.length();
        if (length == 6) {
            return hexString;
        }
        if (length < 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("000000".substring(length));
            sb.append(hexString);
            return sb.toString();
        }
        C000200d.A0p("notification-utils/convertNotificationLightColor could not parse:", i);
        return "FFFFFF";
    }

    public static String A07(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return context.getString(R.string.settings_sound_silent);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse(str));
        String str2 = null;
        if (ringtone == null) {
            return null;
        }
        try {
            str2 = ringtone.getTitle(context);
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    public static String A08(AnonymousClass092 anonymousClass092) {
        String str;
        if ((anonymousClass092 instanceof C09D) || (anonymousClass092 instanceof C09A) || (anonymousClass092 instanceof InterfaceC03910Hq)) {
            return null;
        }
        if (anonymousClass092 instanceof C04160Iu) {
            return ((C04160Iu) anonymousClass092).A07;
        }
        if (anonymousClass092 instanceof C0LN) {
            return null;
        }
        if (anonymousClass092 instanceof AnonymousClass095) {
            return C40731sm.A0n(anonymousClass092) ? C40731sm.A0P(anonymousClass092) : ((AnonymousClass097) anonymousClass092).A1A();
        } else if (anonymousClass092 instanceof C09G) {
            return null;
        } else {
            if (anonymousClass092 instanceof C0LO) {
                return ((AnonymousClass097) anonymousClass092).A1A();
            }
            if (anonymousClass092 instanceof C0JP) {
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
                return C40731sm.A0n(anonymousClass097) ? C40731sm.A0P(anonymousClass097) : anonymousClass097.A1A();
            } else if (anonymousClass092 instanceof C09E) {
                if (C0DB.A0d(anonymousClass092)) {
                    return null;
                }
                return C40731sm.A0P(anonymousClass092);
            } else if ((anonymousClass092 instanceof C04040Ie) || (anonymousClass092 instanceof C04570Ky) || (anonymousClass092 instanceof C0DA) || (anonymousClass092 instanceof C0D8)) {
                return null;
            } else {
                if (anonymousClass092 instanceof C0LP) {
                    return C40731sm.A0P(anonymousClass092);
                }
                if (anonymousClass092 instanceof C0KC) {
                    return ((C0KC) anonymousClass092).A03;
                }
                if ((anonymousClass092 instanceof C04280Jo) || C0Ho.A0N(anonymousClass092) || (anonymousClass092 instanceof C0KT) || (anonymousClass092 instanceof C03890Hn) || (anonymousClass092 instanceof C0LQ) || (anonymousClass092 instanceof C0LS) || !(anonymousClass092 instanceof C0LU)) {
                    return null;
                }
                C0LU c0lu = (C0LU) anonymousClass092;
                if (TextUtils.isEmpty(c0lu.A19())) {
                    str = "";
                } else {
                    StringBuilder A0P = C000200d.A0P(" ");
                    A0P.append(c0lu.A19());
                    str = A0P.toString();
                }
                if (TextUtils.isEmpty(c0lu.A1A())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c0lu.A18());
                    sb.append(str);
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c0lu.A1A());
                sb2.append(" ");
                sb2.append(c0lu.A18());
                sb2.append(str);
                return sb2.toString();
            }
        }
    }

    public static String A09(String str) {
        if (str == null || str.length() <= 1024) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) str.subSequence(0, 1020));
        sb.append("…");
        return sb.toString();
    }

    public static String A0A(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? C000200d.A0I(str2, " ", str3) : C000200d.A0I(str2, " ", A09(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0022, code lost:
        if (r0.booleanValue() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0B(android.content.Context r10, X.C02E r11, android.net.Uri r12, X.C005402l r13, X.C0H9 r14, X.C0L9 r15) {
        /*
            r5 = r12
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 1
            r0 = 22
            if (r1 >= r0) goto L24
            r0 = 21
            if (r1 != r0) goto L49
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L24
            java.util.HashMap r2 = X.C0DU.A0D
            java.lang.Object r0 = r2.get(r12)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L39
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L49
        L24:
            boolean r0 = r15.A00
            if (r0 != 0) goto L8c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 >= r0) goto L8c
            java.io.File r2 = X.AnonymousClass024.A05(r12)
            if (r2 == 0) goto L7d
            r0 = 24
            if (r1 < r0) goto L7d
            goto L74
        L39:
            android.content.ContentResolver r4 = r11.A07()
            if (r4 != 0) goto L4d
            java.lang.String r0 = "messagenotification/is-notification-tone cr=null"
            com.whatsapp.util.Log.w(r0)
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.put(r12, r0)
        L49:
            r14.A02(r12)
            return
        L4d:
            java.lang.String[] r6 = X.C0DU.A0E     // Catch: java.lang.Exception -> L44
            java.lang.String r7 = "is_notification=1"
            r8 = 0
            java.lang.String r9 = "title_key"
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L44
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L6d
            if (r0 <= 0) goto L69
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6d
            r2.put(r12, r0)     // Catch: java.lang.Throwable -> L6d
            r1.close()     // Catch: java.lang.Exception -> L44
            goto L24
        L69:
            r1.close()     // Catch: java.lang.Exception -> L44
            goto L44
        L6d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6f
        L6f:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L73
        L73:
            throw r0     // Catch: java.lang.Exception -> L44
        L74:
            android.net.Uri r5 = X.AnonymousClass024.A04(r10, r2)     // Catch: java.lang.IllegalArgumentException -> L83
            java.lang.String r0 = "com.android.systemui"
            r10.grantUriPermission(r0, r5, r3)     // Catch: java.lang.IllegalArgumentException -> L83
        L7d:
            if (r5 == 0) goto L8c
            r13.A07(r5)
            return
        L83:
            r1 = move-exception
            java.lang.String r0 = "notification/"
            com.whatsapp.util.Log.w(r0, r1)
            r14.A02(r5)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DU.A0B(android.content.Context, X.02E, android.net.Uri, X.02l, X.0H9, X.0L9):void");
    }

    public static long[] A0C(String str) {
        char c;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                } else {
                    return null;
                }
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                } else {
                    return null;
                }
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        if (c != 0 && c != 1) {
            if (c == 2) {
                return new long[]{0, 750, 250, 750, 250};
            }
            return null;
        }
        return new long[]{0, 300, 200, 300, 200};
    }

    public C460424s A0D(AnonymousClass092 anonymousClass092, C06C c06c) {
        CharSequence A09;
        String string;
        AbstractC005302j A0A;
        if (anonymousClass092 == null) {
            return new C460424s("", "");
        }
        C001200o c001200o = this.A06;
        Application application = c001200o.A00;
        byte b = anonymousClass092.A0m;
        if (b != 0 && !(anonymousClass092 instanceof C0LV)) {
            C02E c02e = this.A05;
            C02O c02o = this.A0B;
            C05W c05w = this.A03;
            CharSequence A02 = A02(c02e, c02o, c001200o, this.A07, anonymousClass092);
            if (b == 27) {
                A02 = AnonymousClass029.A0Q(c02e, c02o, A02);
            }
            CharSequence A01 = this.A09.A01(application, A02, anonymousClass092.A0c);
            if (c06c.A0C() && !(anonymousClass092 instanceof C04300Jq) && (A0A = anonymousClass092.A0A()) != null) {
                C018708s c018708s = this.A04;
                StringBuilder A0V = C000200d.A0V(c018708s.A08(c05w.A0A(A0A), false), " @ ");
                A0V.append(c018708s.A08(c06c, false));
                return new C460424s(A0V.toString(), A01);
            }
            return new C460424s(this.A04.A08(c06c, false), A01);
        }
        AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
        if (anonymousClass093 != null) {
            if (anonymousClass093.A02 != 5) {
                string = this.A0A.A0O(anonymousClass092, true);
            } else {
                string = application.getString(R.string.notification_future_payment);
            }
            A09 = AnonymousClass024.A09(string);
        } else if (C40731sm.A0n(anonymousClass092)) {
            String A0P = C40731sm.A0P(anonymousClass092);
            String str = TextUtils.isEmpty(A0P) ? "" : A0P;
            if (!TextUtils.isEmpty(anonymousClass092.A0G())) {
                StringBuilder sb = new StringBuilder();
                sb.append(anonymousClass092.A0G());
                sb.append("\n");
                sb.append(str);
                str = sb.toString();
            }
            A09 = AnonymousClass024.A09(AnonymousClass029.A0Q(this.A05, this.A0B, C002701i.A0p(A09(str))));
        } else {
            A09 = AnonymousClass024.A09(this.A09.A01(application, AnonymousClass029.A0Q(this.A05, this.A0B, C002701i.A0p(A09(anonymousClass092.A0G()))), anonymousClass092.A0c));
        }
        if (!c06c.A0C() && !TextUtils.isEmpty(A09)) {
            return new C460424s(this.A04.A08(c06c, false), A09);
        }
        if (anonymousClass092 instanceof C04300Jq) {
            return new C460424s(this.A04.A08(c06c, false), this.A01.A07((C04300Jq) anonymousClass092, false));
        }
        AbstractC005302j A0A2 = anonymousClass092.A0A();
        if (A0A2 != null) {
            C018708s c018708s2 = this.A04;
            StringBuilder A0V2 = C000200d.A0V(c018708s2.A08(this.A03.A0A(A0A2), false), " @ ");
            A0V2.append(c018708s2.A08(c06c, false));
            return new C460424s(A0V2.toString(), A09);
        }
        return new C460424s(this.A04.A08(c06c, false), A09);
    }

    public CharSequence A0E(AnonymousClass092 anonymousClass092, C06C c06c, boolean z, boolean z2) {
        CharSequence A04;
        if (anonymousClass092 == null) {
            A04 = "";
        } else {
            C001200o c001200o = this.A06;
            byte b = anonymousClass092.A0m;
            if (b == 0) {
                if (!(anonymousClass092 instanceof C04300Jq)) {
                    A04 = AnonymousClass029.A0Q(this.A05, this.A0B, C002701i.A0p(A09(anonymousClass092.A0G())));
                    AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
                    if (anonymousClass093 != null) {
                        if (anonymousClass093.A02 != 5) {
                            A04 = this.A0A.A0O(anonymousClass092, false);
                        } else {
                            A04 = c001200o.A00.getString(R.string.notification_future_payment);
                        }
                    }
                    if (c06c.A0C()) {
                        boolean z3 = anonymousClass092.A0n.A02;
                        if (z) {
                            if (!z3) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(A0F(anonymousClass092.A0A()));
                                sb.append(" @ ");
                                sb.append(this.A04.A08(c06c, false));
                                sb.append(": ");
                                sb.append((Object) A04);
                                A04 = sb.toString();
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.A04.A08(c06c, false));
                                sb2.append(": ");
                                sb2.append((Object) A04);
                                A04 = sb2.toString();
                            }
                        } else if (z2) {
                            if (!z3) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(A0F(anonymousClass092.A0A()));
                                sb3.append(" ");
                                A04 = TextUtils.concat(A03(C002701i.A0p(sb3.toString())), A04);
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(c001200o.A00.getString(R.string.you));
                                sb4.append(" ");
                                A04 = TextUtils.concat(A03(sb4.toString()), A04);
                            }
                        } else if (!z3) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(A0F(anonymousClass092.A0A()));
                            sb5.append(": ");
                            A04 = TextUtils.concat(A03(sb5.toString()), A04);
                        } else {
                            StringBuilder A0P = C000200d.A0P("messagePreview/missing_rmt_src:");
                            A0P.append(C0DB.A08(anonymousClass092));
                            Log.e(A0P.toString());
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(c001200o.A00.getString(R.string.contact));
                            sb6.append(": ");
                            sb6.append((Object) A04);
                            A04 = sb6.toString();
                        }
                    } else if (z) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(this.A04.A08(c06c, false));
                        sb7.append(": ");
                        sb7.append((Object) A04);
                        A04 = sb7.toString();
                    } else if (z2) {
                        if (!anonymousClass092.A0n.A02) {
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(C002701i.A0p(this.A04.A08(c06c, false)));
                            sb8.append(" ");
                            A04 = TextUtils.concat(A03(sb8.toString()), A04);
                        } else {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(c001200o.A00.getString(R.string.you));
                            sb9.append(" ");
                            A04 = TextUtils.concat(A03(sb9.toString()), A04);
                        }
                    }
                } else if (z) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(this.A04.A08(c06c, false));
                    sb10.append(": ");
                    sb10.append(this.A01.A07((C04300Jq) anonymousClass092, false));
                    A04 = sb10.toString();
                } else {
                    A04 = this.A01.A07((C04300Jq) anonymousClass092, false);
                }
            } else {
                CharSequence A02 = A02(this.A05, this.A0B, c001200o, this.A07, anonymousClass092);
                boolean z4 = b == 12;
                if (c06c.A0C()) {
                    if (z) {
                        if (!anonymousClass092.A0n.A02) {
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(A0F(anonymousClass092.A0A()));
                            sb11.append(" @ ");
                            sb11.append(this.A04.A08(c06c, false));
                            sb11.append(": ");
                            sb11.append((Object) A04(A02, z4));
                            A04 = sb11.toString();
                        } else {
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(this.A04.A08(c06c, false));
                            sb12.append(": ");
                            sb12.append((Object) A04(A02, z4));
                            A04 = sb12.toString();
                        }
                    } else if (z2) {
                        if (!anonymousClass092.A0n.A02) {
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(A0F(anonymousClass092.A0A()));
                            sb13.append(" ");
                            A04 = TextUtils.concat(A03(C002701i.A0p(sb13.toString())), A04(C002701i.A0p(A02), z4));
                        } else {
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append(c001200o.A00.getString(R.string.you));
                            sb14.append(" ");
                            A04 = TextUtils.concat(A03(sb14.toString()), A04(C002701i.A0p(A02), z4));
                        }
                    } else {
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append(A0F(anonymousClass092.A0A()));
                        sb15.append(": ");
                        A04 = TextUtils.concat(A03(sb15.toString()), A04(A02, z4));
                    }
                } else if (z) {
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append(this.A04.A08(c06c, false));
                    sb16.append(": ");
                    sb16.append((Object) A04(A02, z4));
                    A04 = sb16.toString();
                } else if (z2) {
                    if (!anonymousClass092.A0n.A02) {
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append(this.A04.A08(c06c, false));
                        sb17.append(" ");
                        A04 = TextUtils.concat(A03(C002701i.A0p(sb17.toString())), A04(C002701i.A0p(A02), z4));
                    } else {
                        StringBuilder sb18 = new StringBuilder();
                        sb18.append(c001200o.A00.getString(R.string.you));
                        sb18.append(" ");
                        A04 = TextUtils.concat(A03(sb18.toString()), A04(C002701i.A0p(A02), z4));
                    }
                } else {
                    A04 = A04(A02, z4);
                }
            }
        }
        return this.A09.A01(this.A06.A00, A04, anonymousClass092.A0c);
    }

    public final String A0F(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            Log.w("notification/messagepreview/getname remote_resource null");
            return "";
        }
        return this.A04.A08(this.A03.A0A(abstractC005302j), false);
    }

    public boolean A0G(C06C c06c) {
        int currentInterruptionFilter;
        NotificationManager.Policy notificationPolicy;
        NotificationManager notificationManager = (NotificationManager) this.A06.A00.getSystemService("notification");
        if (Build.VERSION.SDK_INT < 28 || (currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter()) == 1 || currentInterruptionFilter == 0 || (notificationPolicy = notificationManager.getNotificationPolicy()) == null) {
            return false;
        }
        StringBuilder A0P = C000200d.A0P("NotificationUtils/isDNDTurnedOn NotificationManager policy ");
        A0P.append(notificationPolicy.toString());
        Log.i(A0P.toString());
        if ((notificationPolicy.priorityCategories & 8) == 0) {
            Log.i("VNotificationUtils/isDNDTurnedOn Calls not allowed in DND");
            return true;
        }
        int i = notificationPolicy.priorityCallSenders;
        return i == 1 ? c06c.A08 == null : i == 2;
    }

    public StatusBarNotification[] A0H() {
        NotificationManager notificationManager = (NotificationManager) this.A06.A00.getSystemService("notification");
        if (notificationManager != null) {
            try {
                return notificationManager.getActiveNotifications();
            } catch (Exception e) {
                Log.w("notification-utils/failed to get active notifications: ", e);
            }
        }
        return new StatusBarNotification[0];
    }
}
