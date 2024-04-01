package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1vr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42511vr extends AbstractC40441sG {
    public static volatile C42511vr A0A;
    public Drawable A00;
    public boolean A01;
    public boolean A02;
    public final C012005w A03;
    public final C018508q A04;
    public final C02L A05;
    public final C000400f A06;
    public final C02F A07;
    public final C03350Fj A08;
    public final C41961un A09;

    public C42511vr(C001200o c001200o, C003701t c003701t, C018508q c018508q, C03280Fb c03280Fb, C02L c02l, C012005w c012005w, AnonymousClass034 anonymousClass034, C01B c01b, C41961un c41961un, C03290Fc c03290Fc, C03310Fe c03310Fe, C000400f c000400f, C02F c02f, C0CB c0cb, C0Fi c0Fi, C03350Fj c03350Fj) {
        super(c001200o, c003701t, c03280Fb, c02l, anonymousClass034, c01b, c03290Fc, c03310Fe, c000400f, c0cb, c0Fi);
        this.A04 = c018508q;
        this.A05 = c02l;
        this.A03 = c012005w;
        this.A09 = c41961un;
        this.A06 = c000400f;
        this.A07 = c02f;
        this.A08 = c03350Fj;
    }

    public C42581vy A0B(Context context, boolean z) {
        int i;
        int i2;
        FileInputStream openFileInput;
        boolean A1K = AnonymousClass029.A1K(context);
        if ((this.A01 && A1K != this.A02) || z) {
            this.A00 = null;
        }
        int i3 = 0;
        if (this.A00 == null) {
            this.A01 = false;
            Resources resources = context.getResources();
            File A02 = AbstractC40441sG.A02(context);
            C003701t c003701t = super.A08;
            Drawable A03 = C03410Fp.A03(c003701t, A02, context, resources);
            this.A00 = A03;
            i = A03 != null ? 5 : 2;
            if (A03 == null) {
                try {
                    openFileInput = context.openFileInput("wallpaper.jpg");
                } catch (IOException unused) {
                    i2 = 0;
                } catch (OutOfMemoryError e) {
                    e = e;
                    i2 = 0;
                }
                try {
                    i = openFileInput.read();
                    i2 = i == 4 ? openFileInput.read() : 0;
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        Log.i(e);
                    }
                    if (i == 2 || i == 1) {
                        this.A00 = C03410Fp.A01(context, resources, c003701t);
                        this.A02 = AnonymousClass029.A1K(context);
                        this.A01 = true;
                    } else if (i == 4) {
                        this.A00 = C03410Fp.A00(context, i2, false);
                        this.A02 = AnonymousClass029.A1K(context);
                        this.A01 = true;
                    }
                    i3 = i2;
                } finally {
                }
            }
            Drawable drawable = this.A00;
            if (drawable != null) {
                StringBuilder A0P = C000200d.A0P("wallpaper/get ");
                A0P.append(drawable.getIntrinsicWidth());
                A0P.append("x");
                A0P.append(this.A00.getIntrinsicHeight());
                A0P.append(" ");
                A0P.append(((BitmapDrawable) this.A00).getBitmap().getByteCount());
                Log.i(A0P.toString());
            } else {
                Log.i("wallpaper/get null");
            }
        } else {
            i = 2;
        }
        String str = "DEFAULT";
        if (i != 1 && i != 2) {
            if (i == 4) {
                str = "COLOR_ONLY";
            } else if (i != 5) {
                if (this.A00 == null) {
                    str = "NONE";
                }
            } else {
                str = "DOWNLOADED";
            }
        }
        return new C42581vy(str, this.A00, Integer.valueOf(i3));
    }

    public final void A0C(Context context, Drawable drawable) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput("wallpaper.jpg", 0);
            ((BitmapDrawable) drawable).getBitmap().compress(Bitmap.CompressFormat.JPEG, 90, openFileOutput);
            if (openFileOutput != null) {
                openFileOutput.close();
            }
        } catch (IOException e) {
            Log.e(e);
        }
        A07(context);
    }

    public void A0D(Context context, EnumC03450Ft enumC03450Ft) {
        File file;
        AnonymousClass034 anonymousClass034 = super.A04;
        EnumC03450Ft enumC03450Ft2 = EnumC03450Ft.UNENCRYPTED;
        File A02 = anonymousClass034.A02();
        if (enumC03450Ft == enumC03450Ft2) {
            file = new File(A02, "wallpaper.bkup");
        } else {
            StringBuilder A0P = C000200d.A0P("wallpaper.bkup.crypt");
            A0P.append(enumC03450Ft.version);
            file = new File(A02, A0P.toString());
        }
        List A05 = C03460Fu.A05(EnumC03450Ft.CRYPT14, EnumC03450Ft.A00());
        File file2 = this.A0D;
        ArrayList A04 = C03460Fu.A04(file2, A05);
        C03460Fu.A0C(A04, file2);
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            File file3 = (File) it.next();
            if (!file3.equals(file) && file3.exists()) {
                AnonymousClass024.A0g(file3);
            }
        }
        File A022 = AbstractC40441sG.A02(context);
        if (A022.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                if (!this.A07.A0A(Environment.getExternalStorageState())) {
                    StringBuilder A0P2 = C000200d.A0P("wallpaper/backup/sdcard_unavailable ");
                    A0P2.append(Environment.getExternalStorageState());
                    Log.i(A0P2.toString());
                    return;
                }
                try {
                    C0HH A00 = C0HH.A00(enumC03450Ft, this.A0B, this.A05, super.A07, super.A03, this.A06, this.A0A, file);
                    if (!A00.A05(context)) {
                        Log.e("wallpaper/backup/failed to prepare for backup");
                        return;
                    } else {
                        A00.A04(A022, null);
                        return;
                    }
                } catch (Exception e) {
                    Log.w("wallpaper/backup/error ", e);
                    return;
                }
            }
            throw null;
        }
    }
}
