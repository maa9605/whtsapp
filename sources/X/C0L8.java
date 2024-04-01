package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.0L8  reason: invalid class name */
/* loaded from: classes.dex */
public class C0L8 {
    public static volatile C0L8 A0E;
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C40261rr A02;
    public final C0L7 A03;
    public final C05W A04;
    public final C018708s A05;
    public final C0LF A06;
    public final C001200o A07;
    public final C02F A08;
    public final C05M A09;
    public final C0DK A0A;
    public final C03730Gv A0B;
    public final C0C8 A0C;
    public final InterfaceC002901k A0D;

    public C0L8(C001200o c001200o, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C05M c05m, C0L7 c0l7, C05W c05w, C018708s c018708s, C40261rr c40261rr, C02F c02f, C03730Gv c03730Gv, C0C8 c0c8, C0LF c0lf, C0DK c0dk) {
        this.A07 = c001200o;
        this.A01 = c018508q;
        this.A00 = abstractC000600i;
        this.A0D = interfaceC002901k;
        this.A09 = c05m;
        this.A03 = c0l7;
        this.A04 = c05w;
        this.A05 = c018708s;
        this.A02 = c40261rr;
        this.A08 = c02f;
        this.A0B = c03730Gv;
        this.A0C = c0c8;
        this.A06 = c0lf;
        this.A0A = c0dk;
    }

    public static C0L8 A00() {
        if (A0E == null) {
            synchronized (C0L8.class) {
                if (A0E == null) {
                    A0E = new C0L8(C001200o.A01, C018508q.A00(), AbstractC000600i.A00(), C002801j.A00(), C05M.A00(), C0L7.A02(), C05W.A00(), C018708s.A00(), C40261rr.A00(), C02F.A00(), C03730Gv.A00(), C0C8.A00(), C0LF.A00(), C0DK.A00());
                }
            }
        }
        return A0E;
    }

    public final C0M2 A01(C06C c06c, boolean z, boolean z2) {
        Intent intent;
        Application application = this.A07.A00;
        String A0p = C002701i.A0p(this.A05.A08(c06c, false));
        if (z2) {
            intent = new Intent(application, Conversation.class);
            intent.setAction("android.intent.action.MAIN");
        } else {
            intent = new Intent();
            intent.setAction("com.whatsapp.Conversation");
        }
        intent.addFlags(335544320);
        Jid A02 = c06c.A02();
        if (A02 != null) {
            intent.putExtra("jid", A02.getRawString());
            intent.putExtra("displayname", A0p);
            int dimensionPixelSize = application.getResources().getDimensionPixelSize(R.dimen.shortcut_image_size);
            Bitmap bitmap = null;
            if (z && (bitmap = this.A06.A02(application, c06c, dimensionPixelSize, application.getResources().getDimension(R.dimen.small_avatar_radius), false)) == null) {
                C0L7 c0l7 = this.A03;
                bitmap = c0l7.A00.A00(c0l7.A01.A00, c0l7.A03(c06c));
                if (bitmap.getWidth() != dimensionPixelSize || bitmap.getHeight() != dimensionPixelSize) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true);
                }
            }
            if (!intent.hasExtra("perf_origin")) {
                intent.putExtra("perf_origin", "ShortcutIntentHelper");
            }
            Jid A022 = c06c.A02();
            if (A022 != null) {
                String rawString = A022.getRawString();
                C0M2 c0m2 = new C0M2();
                c0m2.A02 = application;
                c0m2.A07 = rawString;
                c0m2.A0B = new Intent[]{intent};
                c0m2.A05 = A0p;
                if (bitmap != null) {
                    c0m2.A03 = IconCompat.A04(bitmap);
                }
                if (!TextUtils.isEmpty(A0p)) {
                    Intent[] intentArr = c0m2.A0B;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    return c0m2;
                }
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            throw null;
        }
        throw null;
    }

    public void A02() {
        C0M6.A0D(this.A07.A00, this.A00, this.A09, this.A03, this.A04, this.A05, this.A02, this.A08, this.A0B, this.A0C, this.A06, this.A0A);
    }

    public void A03() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            Log.i("WaShortcutsHelper/deletealldynamicshortcuts");
            C0M6.A08(this.A07.A00);
        }
        if (i >= 30) {
            Log.i("WaShortcutsHelper/deleteallcachedshortcuts");
            C0M6.A09(this.A07.A00);
        }
    }

    public void A04() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0D.AS1(new Runnable() { // from class: X.1Ji
                @Override // java.lang.Runnable
                public final void run() {
                    C0L8.this.A02();
                }
            });
        }
    }

    public void A05(Context context, C06C c06c) {
        if (Build.VERSION.SDK_INT >= 30) {
            Log.i("WaShortcutsHelper/publishShortcut");
            C0M6.A0G(context, c06c, this.A03, this.A04, this.A05, this.A06);
        }
    }

    public void A06(C06C c06c) {
        Application application = this.A07.A00;
        C0M2 A01 = A01(c06c, true, false);
        if (C0M7.A05(application)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                ((ShortcutManager) application.getSystemService(ShortcutManager.class)).requestPinShortcut(A01.A00(), null);
            } else if (C0M7.A05(application)) {
                Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                A01.A01(intent);
                application.sendBroadcast(intent);
            }
            if (i < 26) {
                this.A01.A07(R.string.conversation_shortcut_added, 1);
                return;
            }
            return;
        }
        Intent A00 = C0M7.A00(application, A01);
        A00.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        application.sendBroadcast(A00);
        this.A01.A07(R.string.conversation_shortcut_added, 1);
    }

    public void A07(AbstractC005302j abstractC005302j) {
        if (Build.VERSION.SDK_INT >= 30) {
            Log.i("WaShortcutsHelper/removeShortcutFromCache");
            C0M6.A0H(this.A07.A00, abstractC005302j);
        }
    }
}
