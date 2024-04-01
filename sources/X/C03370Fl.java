package X;

import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import java.util.Locale;

/* renamed from: X.0Fl */
/* loaded from: classes.dex */
public class C03370Fl {
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03;
    public C03380Fm A04;
    public C03380Fm A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final C01B A0I;
    public final C02E A0J;
    public final AnonymousClass012 A0K;
    public final C02F A0L;
    public final C0CB A0M;
    public final C03390Fn A0N;

    public C03370Fl(AnonymousClass012 anonymousClass012, C01B c01b, C02E c02e, C0CB c0cb, C02F c02f, C03390Fn c03390Fn) {
        this.A0K = anonymousClass012;
        this.A0I = c01b;
        this.A0J = c02e;
        this.A0M = c0cb;
        this.A0L = c02f;
        this.A0N = c03390Fn;
    }

    public long A00() {
        return A01();
    }

    public long A01() {
        long j = this.A02;
        if (j == -1) {
            return j;
        }
        if (j > this.A0K.A05()) {
            return this.A02;
        }
        return 0L;
    }

    public C03370Fl A02() {
        String str = this.A0C;
        if ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str)) {
            return this;
        }
        if (GroupJid.getNullable(str) != null) {
            return this.A0M.A03();
        }
        return this.A0M.A04();
    }

    public String A03() {
        String str;
        if (((this.A0H && (str = this.A06) != null) || (str = A02().A06) != null) && AnonymousClass024.A0e(this.A0J, this.A0L, Uri.parse(str), false)) {
            return str;
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI.toString();
    }

    public String A04() {
        if (this.A0H && !TextUtils.isEmpty(this.A07)) {
            return this.A07;
        }
        return A02().A07;
    }

    public String A05() {
        if (this.A0H && !TextUtils.isEmpty(this.A08)) {
            return this.A08;
        }
        return A02().A08;
    }

    public String A06() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Integer.toString(0);
        }
        if (this.A0H && !TextUtils.isEmpty(this.A09)) {
            return this.A09;
        }
        return A02().A09;
    }

    public String A07() {
        String str;
        return (((!this.A0H || (str = this.A0A) == null) && (str = A02().A0A) == null) || (Build.VERSION.SDK_INT < 26 && !AnonymousClass024.A0e(this.A0J, this.A0L, Uri.parse(str), false))) ? Settings.System.DEFAULT_NOTIFICATION_URI.toString() : str;
    }

    public String A08() {
        if (this.A0H && !TextUtils.isEmpty(this.A0B)) {
            return this.A0B;
        }
        return A02().A0B;
    }

    public boolean A09() {
        return A00() != 0;
    }

    public boolean A0A() {
        return this.A0F || !A09();
    }

    public boolean A0B() {
        if (!this.A0H) {
            return A02().A0D;
        }
        return this.A0D;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "jid: %s deleted:%d muteEndTime:%d showNotificationWhenMuted:%b useCustomNotification:%b messageTone:%s messageVibrate:%s messagePopup:%s messageLight:%s callTone:%s callVibrate:%s statusMuted:%b pinned:%b pinned_time:%d lowPriorityNotifications:%b mediaVisibility:%d", C003101m.A0A(this.A0C), Long.valueOf(this.A01), Long.valueOf(this.A02), Boolean.valueOf(this.A0F), Boolean.valueOf(this.A0H), this.A0A, this.A0B, this.A09, this.A08, this.A06, this.A07, Boolean.valueOf(this.A0G), Boolean.valueOf(this.A0E), Long.valueOf(this.A03), Boolean.valueOf(this.A0D), Integer.valueOf(this.A00));
    }
}
