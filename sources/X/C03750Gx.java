package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.math.BigDecimal;
import java.util.Calendar;

/* renamed from: X.0Gx */
/* loaded from: classes.dex */
public class C03750Gx {
    public static volatile C03750Gx A09;
    public final C02L A00;
    public final C05W A01;
    public final C018708s A02;
    public final AnonymousClass012 A03;
    public final C001200o A04;
    public final C002301c A05;
    public final C013606n A06;
    public final C0DV A07;
    public final C014406v A08 = C014406v.A00("PaymentsUtils", "infra", "COMMON");

    public C03750Gx(C001200o c001200o, AnonymousClass012 anonymousClass012, C02L c02l, C05W c05w, C018708s c018708s, C002301c c002301c, C0DV c0dv, C013606n c013606n) {
        this.A04 = c001200o;
        this.A03 = anonymousClass012;
        this.A00 = c02l;
        this.A01 = c05w;
        this.A02 = c018708s;
        this.A05 = c002301c;
        this.A07 = c0dv;
        this.A06 = c013606n;
    }

    public static int A00(AnonymousClass093 anonymousClass093) {
        int i = anonymousClass093.A01;
        if (i != 420 && i != 421) {
            switch (i) {
                case GoogleMigrateImporterActivity.A0E /* 11 */:
                case 12:
                case 15:
                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                case 18:
                case 19:
                case C0M6.A01 /* 20 */:
                    return R.color.payments_status_gray;
                case 13:
                case 14:
                    return R.color.payments_status_red;
                case 17:
                    return R.color.payments_status_green;
                default:
                    switch (i) {
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 109:
                        case 112:
                            return R.color.payments_status_gray;
                        case 105:
                        case 107:
                        case C0M6.A03 /* 108 */:
                        case 110:
                        case 111:
                            return R.color.payments_status_red;
                        case 106:
                            return R.color.payments_status_green;
                        default:
                            switch (i) {
                                case 401:
                                case 402:
                                case 403:
                                case 410:
                                case 417:
                                case 418:
                                    return R.color.payments_status_gray;
                                case 404:
                                case 406:
                                case 407:
                                case 408:
                                case 409:
                                case 411:
                                case 412:
                                case 413:
                                case 414:
                                case 415:
                                case 416:
                                    return R.color.payments_status_red;
                                case 405:
                                    return R.color.payments_status_green;
                                default:
                                    switch (i) {
                                        case 601:
                                        case 602:
                                        case 603:
                                        case 606:
                                        case 607:
                                        case 608:
                                            return R.color.payments_status_gray;
                                        case 604:
                                            return R.color.payments_status_green;
                                        case 605:
                                            return R.color.payments_status_red;
                                        default:
                                            return R.color.payments_status_gray;
                                    }
                            }
                    }
            }
        }
        return R.color.payments_status_gray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        if (r3.stripTrailingZeros().scale() <= 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannableStringBuilder A01(X.C002301c r9, X.C014006r r10, X.InterfaceC013706o r11) {
        /*
            r0 = 0
            java.lang.String r8 = r11.A9P(r9)
            java.lang.String r2 = r11.A82(r9, r10, r0)
            java.lang.String r0 = r11.A7z(r9, r10)
            java.math.BigDecimal r3 = r10.A00
            int r1 = r3.scale()
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r2)
            int r6 = r2.indexOf(r0)
            int r9 = r0.length()
            r0 = 1
            r5 = 0
            int r0 = r0 + r1
            if (r1 > 0) goto L26
            r0 = 0
        L26:
            int r4 = r9 - r0
            int r4 = r4 + r6
            int r9 = r9 + r6
            int r0 = r3.signum()
            if (r0 == 0) goto L41
            int r0 = r3.scale()
            if (r0 <= 0) goto L41
            java.math.BigDecimal r0 = r3.stripTrailingZeros()
            int r1 = r0.scale()
            r0 = 0
            if (r1 > 0) goto L42
        L41:
            r0 = 1
        L42:
            java.lang.String r3 = "Roboto-Medium"
            if (r0 == 0) goto L69
            r7.delete(r4, r9)
            java.lang.String r2 = r7.toString()
        L4d:
            int r2 = r2.indexOf(r8)
            int r1 = r8.length()
            int r1 = r1 + r2
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r3)
            r7.setSpan(r0, r2, r1, r5)
            java.lang.String r1 = "sans-serif"
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r1)
            r7.setSpan(r0, r6, r4, r5)
            return r7
        L69:
            java.lang.CharSequence r0 = r7.subSequence(r4, r9)
            java.lang.String r1 = r0.toString()
            X.1QS r0 = new X.1QS
            r0.<init>(r1)
            r7.setSpan(r0, r4, r9, r5)
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r3)
            r7.setSpan(r0, r4, r9, r5)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03750Gx.A01(X.01c, X.06r, X.06o):android.text.SpannableStringBuilder");
    }

    public static C03750Gx A02() {
        if (A09 == null) {
            synchronized (C03750Gx.class) {
                if (A09 == null) {
                    A09 = new C03750Gx(C001200o.A01, AnonymousClass012.A00(), C02L.A00(), C05W.A00(), C018708s.A00(), C002301c.A00(), C0DV.A00(), C013606n.A03());
                }
            }
        }
        return A09;
    }

    public static CharSequence A03(Context context, AnonymousClass093 anonymousClass093) {
        InterfaceC013706o A0B = anonymousClass093.A0B();
        if (A0B != C013806p.A06) {
            return A0B.A9M(context, anonymousClass093.A0O() ? 1 : 0);
        }
        return "";
    }

    public static boolean A04(AnonymousClass093 anonymousClass093) {
        int i = anonymousClass093.A01;
        return i == 405 || i == 106 || i == 604;
    }

    public Pair A05(long j) {
        if (j > 0) {
            int i = (int) (j / 86400000);
            if (i > 0) {
                return new Pair(Integer.valueOf(i), AnonymousClass029.A0c(this.A05, i, 3));
            }
            int i2 = (int) (j / 3600000);
            if (i2 > 0) {
                return new Pair(Integer.valueOf(i2), AnonymousClass029.A0c(this.A05, i2, 2));
            }
            int i3 = (int) (j / 60000);
            if (i3 > 0) {
                return new Pair(Integer.valueOf(i3), AnonymousClass029.A0c(this.A05, i3, 1));
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r2 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair A06(X.AnonymousClass093 r9) {
        /*
            r8 = this;
            java.lang.String r7 = r8.A0I(r9)
            java.lang.String r6 = r8.A0J(r9)
            X.01c r0 = r8.A05
            java.lang.String r1 = r0.A04()
            java.lang.String r0 = "en"
            boolean r2 = r0.equals(r1)
            X.02L r1 = r8.A00
            com.whatsapp.jid.UserJid r0 = r9.A0B
            boolean r0 = r1.A0A(r0)
            r5 = 0
            r4 = 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L39
            if (r2 != 0) goto L39
            X.00o r0 = r8.A04
            android.app.Application r2 = r0.A00
            r1 = 2131888843(0x7f120acb, float:1.9412333E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r7
            java.lang.String r1 = r2.getString(r1, r0)
        L33:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r1)
            return r0
        L39:
            com.whatsapp.jid.UserJid r0 = r9.A0C
            boolean r0 = r1.A0A(r0)
            if (r0 == 0) goto L53
            if (r2 != 0) goto L55
            X.00o r0 = r8.A04
            android.app.Application r2 = r0.A00
            r1 = 2131888842(0x7f120aca, float:1.941233E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r6
            java.lang.String r1 = r2.getString(r1, r0)
            goto L33
        L53:
            if (r2 == 0) goto L56
        L55:
            r3 = r6
        L56:
            X.00o r0 = r8.A04
            android.app.Application r2 = r0.A00
            r1 = 2131888841(0x7f120ac9, float:1.9412329E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r6
            r0[r4] = r7
            java.lang.String r1 = r2.getString(r1, r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03750Gx.A06(X.093):android.util.Pair");
    }

    public C10030fB A07(Context context, boolean z, AbstractC005302j abstractC005302j) {
        String A06 = this.A02.A06(this.A01.A0A(abstractC005302j));
        int i = R.string.payment_invite_status_text_inbound;
        if (z) {
            i = R.string.payment_invite_status_text_outbound;
        }
        return new C10030fB(A06, context.getString(i, A06));
    }

    public CharSequence A08(Context context, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return C013806p.A05.A9L(context);
        }
        C02L c02l = this.A00;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            return C03650Gn.A00(C03650Gn.A01(C002701i.A0s(C04630Le.A02(userJid))).A02).A09.A9L(context);
        }
        throw null;
    }

    public Long A09(AnonymousClass093 anonymousClass093) {
        C0K8 c0k8 = anonymousClass093.A09;
        if (c0k8 == null) {
            return null;
        }
        return Long.valueOf(c0k8.A07() - this.A03.A05());
    }

    public final String A0A(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str, long j) {
        int i12 = i9;
        if (j <= 0) {
            return this.A04.A00.getString(i, str);
        }
        int A00 = C02620Cd.A00(this.A03.A05(), j);
        if (A00 == 0) {
            return this.A04.A00.getString(i2, str);
        }
        if (A00 == 1) {
            return this.A04.A00.getString(i3, str);
        }
        if (A00 < 7) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            switch (calendar.get(7)) {
                case 1:
                    i12 = i10;
                    break;
                case 2:
                    i12 = i4;
                    break;
                case 3:
                    i12 = i5;
                    break;
                case 4:
                    i12 = i6;
                    break;
                case 5:
                    i12 = i7;
                    break;
                case 6:
                    i12 = i8;
                    break;
                case 7:
                    break;
                default:
                    i12 = 0;
                    break;
            }
            return this.A04.A00.getString(i12, str);
        }
        return this.A04.A00.getString(i11, str, C002501g.A09(this.A05, j));
    }

    public String A0B(AnonymousClass093 anonymousClass093) {
        if (anonymousClass093.A0O()) {
            if (this.A00.A0A(anonymousClass093.A0C)) {
                return this.A04.A00.getString(R.string.payments_request_short_status_from_you);
            }
            return this.A04.A00.getString(R.string.payment_row_request_short_status);
        } else if (this.A00.A0A(anonymousClass093.A0B)) {
            return this.A04.A00.getString(R.string.payments_transaction_short_status_to_you);
        } else {
            return this.A04.A00.getString(R.string.payment_row_transaction_short_status);
        }
    }

    public String A0C(AnonymousClass093 anonymousClass093) {
        return (AnonymousClass093.A08(anonymousClass093) || TextUtils.isEmpty(anonymousClass093.A0G) || anonymousClass093.A07 == null) ? "" : anonymousClass093.A0B().A81(this.A05, anonymousClass093.A07);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public String A0D(AnonymousClass093 anonymousClass093) {
        int i = anonymousClass093.A01;
        if (i != 0) {
            switch (i) {
                case GoogleMigrateImporterActivity.A0E /* 11 */:
                    return this.A04.A00.getString(R.string.payments_transaction_status_processing);
                case 12:
                case C0M6.A01 /* 20 */:
                    return this.A04.A00.getString(R.string.payments_transaction_status_pending);
                case 13:
                case 14:
                    return this.A04.A00.getString(R.string.payments_transaction_status_failed);
                case 15:
                    return this.A04.A00.getString(R.string.payments_request_status_rejected);
                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                    return this.A04.A00.getString(R.string.payments_transaction_status_expired);
                case 17:
                    return this.A04.A00.getString(R.string.payments_transaction_status_complete);
                case 18:
                    break;
                case 19:
                    Application application = this.A04.A00;
                    int i2 = anonymousClass093.A02;
                    int i3 = R.string.payments_request_status_request_wait;
                    if (i2 == 10) {
                        i3 = R.string.payments_request_status_requester_wait;
                    }
                    return application.getString(i3);
                default:
                    switch (i) {
                        case 101:
                        case 103:
                        case 104:
                        case 109:
                            return this.A04.A00.getString(R.string.payments_transaction_status_processing);
                        case 102:
                        case 110:
                            return this.A04.A00.getString(R.string.payments_transaction_status_pending);
                        case 105:
                        case C0M6.A03 /* 108 */:
                        case 111:
                            return this.A04.A00.getString(R.string.payments_transaction_status_failed);
                        case 106:
                            return this.A04.A00.getString(R.string.payments_transaction_status_complete);
                        case 107:
                            return this.A04.A00.getString(R.string.payments_transaction_status_expired);
                        case 112:
                            return this.A04.A00.getString(R.string.payments_transaction_status_user_canceled);
                        default:
                            switch (i) {
                                case 401:
                                case 403:
                                case 410:
                                case 420:
                                    return this.A04.A00.getString(R.string.payments_transaction_status_processing);
                                case 402:
                                    return this.A04.A00.getString(R.string.payments_transaction_status_pending);
                                case 404:
                                case 406:
                                case 407:
                                case 408:
                                case 409:
                                case 411:
                                case 412:
                                case 413:
                                case 414:
                                case 415:
                                    return this.A04.A00.getString(R.string.payments_transaction_status_failed);
                                case 405:
                                    return this.A04.A00.getString(R.string.payments_transaction_status_complete);
                                case 416:
                                    return this.A04.A00.getString(R.string.payments_transaction_status_expired);
                                case 417:
                                    return this.A04.A00.getString(R.string.payments_request_status_scheduled);
                                case 418:
                                    return this.A04.A00.getString(R.string.payments_transaction_status_canceling);
                                case 419:
                                    return this.A04.A00.getString(R.string.payments_transaction_status_pending);
                                case 421:
                                    return this.A04.A00.getString(R.string.payments_transaction_status_user_canceled);
                                default:
                                    switch (i) {
                                        case 601:
                                        case 602:
                                            return this.A04.A00.getString(R.string.payments_transaction_status_processing);
                                        case 603:
                                            return this.A04.A00.getString(R.string.payments_transaction_status_withdrawal_in_review);
                                        case 604:
                                            return this.A04.A00.getString(R.string.payments_transaction_status_complete);
                                        case 605:
                                            return this.A04.A00.getString(R.string.payments_transaction_status_failed);
                                        case 606:
                                            break;
                                        case 607:
                                            return this.A04.A00.getString(R.string.payments_transaction_status_expired);
                                        case 608:
                                            return this.A04.A00.getString(R.string.payments_transaction_status_pending);
                                        default:
                                            return this.A04.A00.getString(R.string.payments_transaction_status_unknown);
                                    }
                            }
                    }
            }
            return this.A04.A00.getString(R.string.payments_transaction_status_user_canceled);
        }
        return "";
    }

    public final String A0E(AnonymousClass093 anonymousClass093) {
        Long A092 = A09(anonymousClass093);
        if (A092 == null) {
            return "";
        }
        long longValue = A092.longValue();
        Pair A05 = A05(longValue);
        if (A05 != null) {
            return this.A04.A00.getResources().getQuantityString(R.plurals.payments_message_bubble_status_label_desc_expiration, ((Number) A05.first).intValue(), A05.second);
        }
        if (longValue > 0) {
            return this.A04.A00.getString(R.string.payments_message_bubble_status_label_desc_expiration_sub_minute);
        }
        return this.A04.A00.getString(R.string.payments_message_bubble_status_label_desc_expiring);
    }

    public final String A0F(AnonymousClass093 anonymousClass093) {
        if (this.A00.A0A(anonymousClass093.A0B)) {
            return this.A04.A00.getString(R.string.payment_data_localized_preview_to_me);
        }
        return this.A04.A00.getString(R.string.payment_data_localized_preview_to_other, A0H(anonymousClass093));
    }

    public synchronized String A0G(AnonymousClass093 anonymousClass093) {
        return A0L(anonymousClass093, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x004f, code lost:
        if (r1 != 1000) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.String A0H(X.AnonymousClass093 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.whatsapp.jid.UserJid r1 = r6.A0B     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L1c
            X.05W r0 = r5.A01     // Catch: java.lang.Throwable -> La6
            X.06C r4 = r0.A0A(r1)     // Catch: java.lang.Throwable -> La6
        Lb:
            X.00o r2 = r5.A04     // Catch: java.lang.Throwable -> La6
            android.app.Application r1 = r2.A00     // Catch: java.lang.Throwable -> La6
            r0 = 2131890310(0x7f121086, float:1.9415308E38)
            java.lang.String r3 = r1.getString(r0)     // Catch: java.lang.Throwable -> La6
            int r1 = r6.A02     // Catch: java.lang.Throwable -> La6
            r0 = 1
            if (r1 == r0) goto L1e
            goto L37
        L1c:
            r4 = 0
            goto Lb
        L1e:
            if (r4 == 0) goto L21
            goto L53
        L21:
            X.0K8 r0 = r6.A09     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.A0A()     // Catch: java.lang.Throwable -> La6
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto L51
            X.0K8 r0 = r6.A09     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r0.A0A()     // Catch: java.lang.Throwable -> La6
            monitor-exit(r5)
            return r0
        L37:
            r0 = 2
            if (r1 == r0) goto L9b
            r0 = 3
            if (r1 == r0) goto L5b
            r0 = 10
            if (r1 == r0) goto L9b
            r0 = 20
            if (r1 == r0) goto L1e
            r0 = 100
            if (r1 == r0) goto L1e
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L9b
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L65
        L51:
            monitor-exit(r5)
            return r3
        L53:
            X.08s r0 = r5.A02     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r0.A06(r4)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r5)
            return r0
        L5b:
            if (r4 == 0) goto L65
            X.08s r0 = r5.A02     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r0.A06(r4)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r5)
            return r0
        L65:
            X.02L r1 = r5.A00     // Catch: java.lang.Throwable -> L99
            com.whatsapp.jid.UserJid r0 = r6.A0B     // Catch: java.lang.Throwable -> L99
            boolean r0 = r1.A0A(r0)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L79
            android.app.Application r1 = r2.A00     // Catch: java.lang.Throwable -> L99
            r0 = 2131890845(0x7f12129d, float:1.9416393E38)
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L99
            goto L97
        L79:
            com.whatsapp.jid.UserJid r1 = r6.A0B     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L84
            X.05W r0 = r5.A01     // Catch: java.lang.Throwable -> L99
            X.06C r1 = r0.A0A(r1)     // Catch: java.lang.Throwable -> L99
            goto L85
        L84:
            r1 = 0
        L85:
            if (r1 == 0) goto L8e
            X.08s r0 = r5.A02     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r0.A06(r1)     // Catch: java.lang.Throwable -> L99
            goto L97
        L8e:
            android.app.Application r1 = r2.A00     // Catch: java.lang.Throwable -> L99
            r0 = 2131890310(0x7f121086, float:1.9415308E38)
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L99
        L97:
            monitor-exit(r5)
            return r0
        L99:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La6
        L9b:
            android.app.Application r1 = r2.A00     // Catch: java.lang.Throwable -> La6
            r0 = 2131890845(0x7f12129d, float:1.9416393E38)
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r5)
            return r0
        La6:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03750Gx.A0H(X.093):java.lang.String");
    }

    public synchronized String A0I(AnonymousClass093 anonymousClass093) {
        C000700j.A07(anonymousClass093.A0O());
        UserJid userJid = anonymousClass093.A0C;
        C06C A0A = userJid != null ? this.A01.A0A(userJid) : null;
        if (A0A != null) {
            if (this.A00.A0A(A0A.A02())) {
                return this.A04.A00.getString(R.string.you);
            }
            return this.A02.A06(A0A);
        }
        C0K8 c0k8 = anonymousClass093.A09;
        if (c0k8 != null && !TextUtils.isEmpty(c0k8.A0B())) {
            return anonymousClass093.A09.A0B();
        }
        return this.A04.A00.getString(R.string.unknown);
    }

    public synchronized String A0J(AnonymousClass093 anonymousClass093) {
        C000700j.A07(anonymousClass093.A0O());
        UserJid userJid = anonymousClass093.A0B;
        C06C A0A = userJid != null ? this.A01.A0A(userJid) : null;
        if (A0A != null) {
            if (this.A00.A0A(A0A.A02())) {
                return this.A04.A00.getString(R.string.you);
            }
            return this.A02.A06(A0A);
        }
        C0K8 c0k8 = anonymousClass093.A09;
        if (c0k8 != null && !TextUtils.isEmpty(c0k8.A0A())) {
            return anonymousClass093.A09.A0A();
        }
        return this.A04.A00.getString(R.string.unknown);
    }

    public synchronized String A0K(AnonymousClass093 anonymousClass093) {
        UserJid userJid = anonymousClass093.A0C;
        C06C A0A = userJid != null ? this.A01.A0A(userJid) : null;
        if (A0A != null) {
            return this.A02.A06(A0A);
        }
        C0K8 c0k8 = anonymousClass093.A09;
        if (c0k8 != null) {
            String A0B = c0k8.A0B();
            if (!TextUtils.isEmpty(A0B)) {
                return A0B;
            }
        }
        return this.A04.A00.getString(R.string.unknown);
    }

    public synchronized String A0L(AnonymousClass093 anonymousClass093, boolean z) {
        String A08;
        String A082;
        String string;
        int i = anonymousClass093.A02;
        if (i != 10) {
            if (i != 20) {
                if (i != 30) {
                    if (i != 40 && i != 100) {
                        if (i != 200) {
                            if (i != 1000) {
                                switch (i) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        break;
                                    case 6:
                                        return this.A04.A00.getString(R.string.payment_transaction_type_deposit);
                                    case 7:
                                        return this.A04.A00.getString(this.A07.A03().AC3());
                                    case 8:
                                        return this.A04.A00.getString(R.string.payment_transaction_type_withdrawal);
                                    default:
                                        return this.A04.A00.getString(R.string.unknown);
                                }
                            }
                        }
                    }
                }
                UserJid userJid = anonymousClass093.A0B;
                if (userJid != null && anonymousClass093.A0C != null) {
                    C06C A0A = this.A01.A0A(this.A00.A0A(userJid) ? anonymousClass093.A0C : anonymousClass093.A0B);
                    if (z) {
                        string = this.A02.A06(A0A);
                    } else {
                        string = this.A02.A08(A0A, false);
                    }
                } else {
                    string = this.A04.A00.getString(R.string.unknown);
                }
                return string;
            }
            UserJid userJid2 = anonymousClass093.A0B;
            if (userJid2 != null) {
                C06C A0A2 = this.A01.A0A(userJid2);
                if (z) {
                    A082 = this.A02.A06(A0A2);
                } else {
                    A082 = this.A02.A08(A0A2, false);
                }
                return A082;
            }
            C0K8 c0k8 = anonymousClass093.A09;
            if (c0k8 != null && !TextUtils.isEmpty(c0k8.A0A())) {
                return anonymousClass093.A09.A0A();
            }
            return this.A04.A00.getString(R.string.unknown);
        }
        UserJid userJid3 = anonymousClass093.A0C;
        if (userJid3 != null) {
            C06C A0A3 = this.A01.A0A(userJid3);
            if (z) {
                A08 = this.A02.A06(A0A3);
            } else {
                A08 = this.A02.A08(A0A3, false);
            }
            return A08;
        }
        C0K8 c0k82 = anonymousClass093.A09;
        if (c0k82 != null && !TextUtils.isEmpty(c0k82.A0B())) {
            return anonymousClass093.A09.A0B();
        }
        return this.A04.A00.getString(R.string.unknown);
    }

    public String A0M(AnonymousClass092 anonymousClass092) {
        AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
        String str = "";
        if (anonymousClass093 != null) {
            if (anonymousClass093.A02 == 1000) {
                return A0F(anonymousClass093);
            }
            if (!TextUtils.isEmpty(anonymousClass093.A0G)) {
                AnonymousClass093 anonymousClass0932 = anonymousClass092.A0F;
                if (anonymousClass0932.A07 != null) {
                    str = anonymousClass0932.A0B().A7z(this.A05, anonymousClass092.A0F.A07);
                }
            }
            if (anonymousClass092.A0m != 0 || TextUtils.isEmpty(anonymousClass092.A0G())) {
                return str;
            }
            StringBuilder A0V = C000200d.A0V(str, " • ");
            A0V.append(anonymousClass092.A0G());
            return A0V.toString();
        }
        return "";
    }

    public synchronized String A0N(AnonymousClass092 anonymousClass092, AnonymousClass093 anonymousClass093) {
        C05W c05w = this.A01;
        UserJid A0B = anonymousClass092.A0B();
        if (A0B != null) {
            C06C A0A = c05w.A0A(A0B);
            if (anonymousClass092 instanceof C0LQ) {
                if (anonymousClass093.A07 != null) {
                    Application application = this.A04.A00;
                    boolean z = anonymousClass092.A0n.A02;
                    int i = R.string.payment_system_event_my_request_declined;
                    if (z) {
                        i = R.string.payment_system_event_request_declined;
                    }
                    return application.getString(i, this.A02.A08(A0A, false), A0C(anonymousClass093));
                }
                Application application2 = this.A04.A00;
                boolean z2 = anonymousClass092.A0n.A02;
                int i2 = R.string.payment_system_event_my_request_declined_no_amount;
                if (z2) {
                    i2 = R.string.payment_system_event_request_declined_no_amount;
                }
                return application2.getString(i2, this.A02.A08(A0A, false), A0C(anonymousClass093));
            } else if (anonymousClass092 instanceof C0LS) {
                if (anonymousClass093.A07 != null) {
                    Application application3 = this.A04.A00;
                    boolean z3 = anonymousClass092.A0n.A02;
                    int i3 = R.string.payment_system_event_request_canceled;
                    if (z3) {
                        i3 = R.string.payment_system_event_request_canceled_by_me;
                    }
                    return application3.getString(i3, this.A02.A08(A0A, false), A0C(anonymousClass093));
                }
                Application application4 = this.A04.A00;
                boolean z4 = anonymousClass092.A0n.A02;
                int i4 = R.string.payment_system_event_request_canceled_no_amount;
                if (z4) {
                    i4 = R.string.payment_system_event_request_canceled_by_me_no_amount;
                }
                return application4.getString(i4, this.A02.A08(A0A, false), A0C(anonymousClass093));
            } else {
                throw new IllegalStateException(C014406v.A01("PaymentsUtils", "Request message is not cancelled or rejected"));
            }
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0152, code lost:
        if (r19 == false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.String A0O(X.AnonymousClass092 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03750Gx.A0O(X.092, boolean):java.lang.String");
    }

    public String A0P(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split(";");
        if (split.length != 2) {
            return "";
        }
        InterfaceC013706o A01 = C013606n.A01(split[0]);
        try {
            return A01.A81(this.A05, new C014006r(new BigDecimal(split[1]).movePointLeft(3), A01.A9i()));
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public String A0Q(boolean z, String str, String str2, int i, int i2, long j, long j2, String str3, int i3) {
        if (!z) {
            if (i == 102) {
                return this.A04.A00.getResources().getQuantityString(R.plurals.payments_transaction_system_message_to_me_pending_setup, i3, str2, str3);
            }
            if (i == 106) {
                if (i2 == 104 || i2 == 103 || i2 == 102) {
                    return A0A(R.string.payments_transaction_system_message_to_me_success_with_hiccup_no_timestamp, R.string.payments_transaction_system_message_to_me_success_with_hiccup_today, R.string.payments_transaction_system_message_to_me_success_with_hiccup_yesterday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_monday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_tuesday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_wednesday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_thursday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_friday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_saturday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_sunday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_day_and_month, str2, j);
                }
            } else if (i == 420) {
                return this.A04.A00.getString(R.string.transaction_status_pending_processing);
            }
            return "";
        } else if (i != 406 && i != 407 && i != 412) {
            if (i != 408 && i != 404 && i != 411) {
                if (i == 409) {
                    int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    Application application = this.A04.A00;
                    if (i4 > 0) {
                        return application.getString(R.string.payments_transaction_system_message_from_me_refunded_failure, str, application.getString(R.string.transaction_timestamp_format, C002501g.A0B(this.A05, j)));
                    }
                    return application.getString(R.string.payments_transaction_system_message_from_me_refunded_failure_no_timestamp, str);
                }
                return "";
            }
            return A0A(R.string.payments_transaction_system_message_from_me_refunded_no_timestamp, R.string.payments_transaction_system_message_from_me_refunded_today, R.string.payments_transaction_system_message_from_me_refunded_yesterday, R.string.payments_transaction_system_message_from_me_refunded_on_monday, R.string.payments_transaction_system_message_from_me_refunded_on_tuesday, R.string.payments_transaction_system_message_from_me_refunded_on_wednesday, R.string.payments_transaction_system_message_from_me_refunded_on_thursday, R.string.payments_transaction_system_message_from_me_refunded_on_friday, R.string.payments_transaction_system_message_from_me_refunded_on_saturday, R.string.payments_transaction_system_message_from_me_refunded_on_sunday, R.string.payments_transaction_system_message_from_me_refunded_day_and_month, str, j2);
        } else {
            return A0A(R.string.payments_transaction_system_message_from_me_failed_no_timestamp, R.string.payments_transaction_system_message_from_me_failed_today, R.string.payments_transaction_system_message_from_me_failed_yesterday, R.string.payments_transaction_system_message_from_me_failed_on_monday, R.string.payments_transaction_system_message_from_me_failed_on_tuesday, R.string.payments_transaction_system_message_from_me_failed_on_wednesday, R.string.payments_transaction_system_message_from_me_failed_on_thursday, R.string.payments_transaction_system_message_from_me_failed_on_friday, R.string.payments_transaction_system_message_from_me_failed_on_saturday, R.string.payments_transaction_system_message_from_me_failed_on_sunday, R.string.payments_transaction_system_message_from_me_failed_day_and_month, str, j);
        }
    }

    public boolean A0R(AnonymousClass093 anonymousClass093, InterfaceC06790Va interfaceC06790Va) {
        int i;
        int A01 = AnonymousClass024.A01(anonymousClass093.A0H, -1);
        int i2 = anonymousClass093.A02;
        if ((i2 != 1 && i2 != 100) || !this.A00.A0A(anonymousClass093.A0C) || !anonymousClass093.A0J() || (i = anonymousClass093.A01) == 419 || i == 409 || i == 405 || i == 407 || i == 0 || A01 == 441 || A01 == 410 || A01 == 11455 || A01 == 2826008) {
            return false;
        }
        return interfaceC06790Va == null || !(interfaceC06790Va.AFu(A01) || interfaceC06790Va.AFS(A01) || interfaceC06790Va.AFO(A01) || interfaceC06790Va.AFM(A01) || interfaceC06790Va.AFW(A01));
    }
}
