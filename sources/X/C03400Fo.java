package X;

import android.app.NotificationChannel;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.0Fo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03400Fo extends C03370Fl {
    public C03400Fo(AnonymousClass012 anonymousClass012, C01B c01b, C02E c02e, C0CB c0cb, C02F c02f, C03390Fn c03390Fn) {
        super(anonymousClass012, c01b, c02e, c0cb, c02f, c03390Fn);
    }

    @Override // X.C03370Fl
    public long A00() {
        NotificationChannel A04;
        if (this.A0H && (A04 = this.A0N.A04(this.A0C)) != null && A04.getImportance() < 3) {
            StringBuilder A0P = C000200d.A0P("chat-settings-store/getMuteEndTime notification channel muted for:");
            A0P.append(C003101m.A0A(this.A0C));
            Log.i(A0P.toString());
            return -1L;
        }
        return A01();
    }

    @Override // X.C03370Fl
    public boolean A0A() {
        NotificationChannel A04;
        if (this.A0H && (A04 = this.A0N.A04(this.A0C)) != null && A04.getImportance() == 0) {
            StringBuilder A0P = C000200d.A0P("chat-settings-store/getShowNotifications notification channel disabled for:");
            A0P.append(C003101m.A0A(this.A0C));
            Log.i(A0P.toString());
            return false;
        }
        return super.A0A();
    }

    public String A0C() {
        String A00;
        C03490Fx c03490Fx = C03390Fn.A0N;
        String A002 = c03490Fx.A00(this.A0C);
        if (TextUtils.isEmpty(A002)) {
            if (this.A0H) {
                StringBuilder A0P = C000200d.A0P("chat-settings-store/getNotificationChannelId missing channel for chat with custom notifications:");
                A0P.append(C003101m.A0A(this.A0C));
                Log.i(A0P.toString());
                C03390Fn c03390Fn = this.A0N;
                String str = this.A0C;
                c03390Fn.A0A(str, c03390Fn.A08(str), A0B() ? 3 : 4, this.A08, this.A0B, c03390Fn.A07(this.A0A), "channel_group_chats");
                return c03490Fx.A00(this.A0C);
            }
            if (C003101m.A0U(AbstractC005302j.A02(this.A0C))) {
                A00 = c03490Fx.A00("group_chat_defaults");
            } else {
                A00 = c03490Fx.A00("individual_chat_defaults");
            }
            if (this.A0I.A0E(C01C.A1i)) {
                return A00;
            }
            C03390Fn c03390Fn2 = this.A0N;
            int i = A0B() ? 3 : 4;
            String A05 = A05();
            String A08 = A08();
            String A07 = A07();
            if (c03390Fn2 != null) {
                String A01 = c03490Fx.A01(A00);
                if (("group_chat_defaults".equals(A01) || "individual_chat_defaults".equals(A01)) && c03390Fn2.A05().getNotificationChannel(A00).getImportance() < 3) {
                    StringBuilder A0P2 = C000200d.A0P("chat-settings-store/repairDefaultChannelIfNeeded repairing channel:");
                    A0P2.append(C003101m.A0A(A01));
                    Log.i(A0P2.toString());
                    c03390Fn2.A0E(A01);
                    return c03390Fn2.A0A(A01, c03390Fn2.A08(A01), i, A05, A08, A07 == null ? Settings.System.DEFAULT_NOTIFICATION_URI : Uri.parse(A07), "channel_group_chats");
                }
                return A00;
            }
            throw null;
        }
        return A002;
    }

    public String A0D() {
        C03390Fn c03390Fn = this.A0N;
        C03490Fx c03490Fx = C03390Fn.A0N;
        String A00 = c03490Fx.A00("silent_notifications");
        if (c03390Fn != null) {
            String A01 = c03490Fx.A01(A00);
            if (!"silent_notifications".equals(A01) || c03390Fn.A05().getNotificationChannel(A00).getImportance() <= 2) {
                return A00;
            }
            StringBuilder A0P = C000200d.A0P("chat-settings-store/repairSilentNotificationChannel repairing channel:");
            A0P.append(C003101m.A0A(A01));
            Log.i(A0P.toString());
            c03390Fn.A0E(A01);
            return c03390Fn.A0A(A01, c03390Fn.A08(A01), 2, null, null, null, null);
        }
        throw null;
    }
}
