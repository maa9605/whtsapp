package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import java.io.File;
import java.util.AbstractMap;

/* renamed from: X.05r */
/* loaded from: classes.dex */
public class C011505r {
    public static volatile C011505r A04;
    public final C012005w A00;
    public final C02L A01;
    public final C011605s A02;
    public final C001200o A03;

    public C011505r(C001200o c001200o, C011605s c011605s, C02L c02l, C012005w c012005w) {
        this.A03 = c001200o;
        this.A02 = c011605s;
        this.A01 = c02l;
        this.A00 = c012005w;
    }

    public static C011505r A00() {
        if (A04 == null) {
            synchronized (C011505r.class) {
                if (A04 == null) {
                    A04 = new C011505r(C001200o.A01, C011605s.A00(), C02L.A00(), C012005w.A00());
                }
            }
        }
        return A04;
    }

    public Bitmap A01(C06C c06c, int i, float f) {
        return (Bitmap) this.A02.A02().A01(c06c.A06(i, f));
    }

    public File A02() {
        File file = this.A00.A04().A09;
        AbstractC012105x.A03(file, false);
        return AbstractC012105x.A01(file, "tmpp");
    }

    public File A03(C06C c06c) {
        if (c06c instanceof C10190fR) {
            return A02();
        }
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 != null) {
            if (this.A01.A0A(A03)) {
                return new File(this.A03.A00.getFilesDir(), "me.jpg");
            }
            File file = new File(this.A03.A00.getCacheDir(), "Profile Pictures");
            if (!file.exists()) {
                file.mkdirs();
            }
            String str = A03.user;
            if (str != null) {
                return new File(file, C000200d.A0L(new StringBuilder(), str, ".jpg"));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A03.getRawString());
            sb.append(".jpg");
            return new File(file, sb.toString());
        }
        throw null;
    }

    public File A04(C06C c06c) {
        if (c06c instanceof C10190fR) {
            return A02();
        }
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 != null) {
            File file = new File(this.A03.A00.getFilesDir(), "Avatars");
            if (!file.exists()) {
                file.mkdirs();
            }
            return new File(file, C000200d.A0H(this.A01.A0A(A03) ? "me" : A03.getRawString(), ".j"));
        }
        throw null;
    }

    public void A05(C06C c06c) {
        File A03 = A03(c06c);
        if (A03.exists()) {
            A03.delete();
        }
        File A042 = A04(c06c);
        if (A042.exists()) {
            A042.delete();
        }
    }

    public void A06(String str) {
        C0JH A02 = this.A02.A02();
        for (String str2 : ((AbstractMap) A02.A00.A06()).keySet()) {
            if (str2.startsWith(str)) {
                A02.A04(str2);
            }
        }
    }

    public boolean A07(C06C c06c) {
        Resources resources = this.A03.A00.getResources();
        return A01(c06c, resources.getDimensionPixelSize(R.dimen.small_avatar_size), resources.getDimension(R.dimen.small_avatar_radius)) != null;
    }

    public boolean A08(C06C c06c) {
        File A042 = A04(c06c);
        if (!A042.exists()) {
            A042 = A03(c06c);
        }
        return A042.exists();
    }
}
