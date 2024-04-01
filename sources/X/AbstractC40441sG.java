package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1sG */
/* loaded from: classes2.dex */
public abstract class AbstractC40441sG {
    public boolean A00;
    public final C02L A01;
    public final C01B A02;
    public final C03310Fe A03;
    public final AnonymousClass034 A04;
    public final C000400f A05;
    public final C001200o A06;
    public final C03290Fc A07;
    public final C003701t A08;
    public final C0CB A09;
    public final C0Fi A0A;
    public final C03280Fb A0B;
    public final File A0C;
    public final File A0D;

    public AbstractC40441sG(C001200o c001200o, C003701t c003701t, C03280Fb c03280Fb, C02L c02l, AnonymousClass034 anonymousClass034, C01B c01b, C03290Fc c03290Fc, C03310Fe c03310Fe, C000400f c000400f, C0CB c0cb, C0Fi c0Fi) {
        this.A06 = c001200o;
        this.A08 = c003701t;
        this.A0B = c03280Fb;
        this.A01 = c02l;
        this.A04 = anonymousClass034;
        this.A02 = c01b;
        this.A07 = c03290Fc;
        this.A03 = c03310Fe;
        this.A05 = c000400f;
        this.A09 = c0cb;
        this.A0A = c0Fi;
        this.A0C = new File(anonymousClass034.A02(), "wallpapers.backup");
        this.A0D = new File(anonymousClass034.A02(), "wallpaper.bkup");
    }

    public static Point A00(Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
            if (context.getResources().getConfiguration().orientation == 2) {
                int i = point.y;
                point.y = point.x;
                point.x = i;
            }
            point.y -= C003301p.A02(context) + ((int) context.getResources().getDimension(R.dimen.abc_action_bar_default_height_material));
            return point;
        }
        throw null;
    }

    public static C0DH A01(Point point, boolean z, C003701t c003701t) {
        int i = point.x;
        int i2 = point.y;
        Long valueOf = Long.valueOf(Runtime.getRuntime().maxMemory() / 32);
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (c003701t.A0C(211)) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inDither = z;
        return new C0DH(i, i2, valueOf, false, options);
    }

    public static File A02(Context context) {
        return new File(context.getFilesDir(), "wallpaper.jpg");
    }

    public Uri A03() {
        if (!(this instanceof C42501vq)) {
            C42511vr c42511vr = (C42511vr) this;
            C02L c02l = c42511vr.A05;
            c02l.A05();
            UserJid userJid = c02l.A03;
            if (userJid != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(userJid.getRawString());
                sb2.append(System.currentTimeMillis());
                sb.append(C02A.A01(sb2.toString()));
                sb.append(".jpg");
                String obj = sb.toString();
                File file = c42511vr.A03.A04().A0P;
                AbstractC012105x.A03(file, false);
                return Uri.fromFile(new File(file, obj));
            }
            throw null;
        }
        return ((C42501vq) this).A04.A03();
    }

    public C42571vx A04(AbstractC005302j abstractC005302j, Context context) {
        if (!(this instanceof C42501vq)) {
            return ((C42511vr) this).A0B(context, false);
        }
        C42501vq c42501vq = (C42501vq) this;
        C0FK A0B = c42501vq.A0B(abstractC005302j, context);
        Object obj = A0B.A00;
        if (obj != null) {
            C03380Fm c03380Fm = (C03380Fm) obj;
            Object obj2 = A0B.A01;
            if (obj2 != null) {
                return c42501vq.A0C(c03380Fm, context, ((Boolean) obj2).booleanValue());
            }
            throw null;
        }
        throw null;
    }

    public C42571vx A05(AbstractC005302j abstractC005302j, Context context, Uri uri, boolean z, int i, int i2) {
        InputStream fileInputStream;
        if (!(this instanceof C42501vq)) {
            C42511vr c42511vr = (C42511vr) this;
            C000200d.A0t("wallpaper/set with Uri with size (width x height): ", i, "x", i2);
            c42511vr.A00 = null;
            try {
                InputStream A0e = c42511vr.A09.A0e(uri);
                Bitmap bitmap = C002701i.A0M(A0e, A01(A00(context), false, ((AbstractC40441sG) c42511vr).A08)).A02;
                if (bitmap != null) {
                    c42511vr.A00 = new BitmapDrawable(context.getResources(), bitmap);
                } else {
                    c42511vr.A04.A05(R.string.error_load_wallpaper, 0);
                }
                ((AbstractC40441sG) c42511vr).A00 = true;
                A0e.close();
            } catch (IOException e) {
                Log.e(e);
            }
            Drawable drawable = c42511vr.A00;
            if (drawable != null) {
                c42511vr.A0C(context, drawable);
            }
            return new C42571vx(c42511vr.A00);
        }
        C42501vq c42501vq = (C42501vq) this;
        BitmapDrawable bitmapDrawable = null;
        try {
            C41961un c41961un = c42501vq.A05;
            if (z) {
                fileInputStream = c41961un.A0e(uri);
            } else {
                fileInputStream = new FileInputStream(AnonymousClass024.A05(uri));
            }
            Bitmap bitmap2 = C002701i.A0M(fileInputStream, A01(A00(context), false, c42501vq.A08)).A02;
            if (bitmap2 != null) {
                bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap2);
            } else {
                c42501vq.A01.A05(R.string.error_load_wallpaper, 0);
            }
            fileInputStream.close();
        } catch (IOException unused) {
            c42501vq.A01.A05(R.string.error_load_wallpaper, 0);
        }
        if (bitmapDrawable == null) {
            return c42501vq.A04(abstractC005302j, context);
        }
        return c42501vq.A0C(c42501vq.A0E(abstractC005302j, context, bitmapDrawable), context, abstractC005302j == null);
    }

    public List A06() {
        List A05 = C03460Fu.A05(EnumC03450Ft.CRYPT14, EnumC03450Ft.A00());
        File file = this.A0C;
        ArrayList A04 = C03460Fu.A04(file, A05);
        File file2 = new File(this.A04.A02(), "Wallpapers");
        if (file2.exists()) {
            A04.add(file2);
        }
        C03460Fu.A0C(A04, file);
        return A04;
    }

    public void A07(Context context) {
        EnumC03450Ft enumC03450Ft;
        File file;
        EnumC03450Ft enumC03450Ft2;
        if (!(this instanceof C42501vq)) {
            C42511vr c42511vr = (C42511vr) this;
            C003701t c003701t = ((AbstractC40441sG) c42511vr).A08;
            if (((AbstractC40441sG) c42511vr).A03 != null) {
                if (c003701t.A0C(454)) {
                    enumC03450Ft2 = EnumC03450Ft.CRYPT14;
                } else {
                    enumC03450Ft2 = EnumC03450Ft.CRYPT13;
                }
                c42511vr.A0D(context, enumC03450Ft2);
                return;
            }
            throw null;
        }
        C42501vq c42501vq = (C42501vq) this;
        C003701t c003701t2 = c42501vq.A08;
        C03310Fe c03310Fe = ((AbstractC40441sG) c42501vq).A03;
        if (c03310Fe != null) {
            if (c003701t2.A0C(454)) {
                enumC03450Ft = EnumC03450Ft.CRYPT14;
            } else {
                enumC03450Ft = EnumC03450Ft.CRYPT13;
            }
            EnumC03450Ft enumC03450Ft3 = EnumC03450Ft.UNENCRYPTED;
            c42501vq.A04.A0D(context, enumC03450Ft);
            if (C03410Fp.A08(((AbstractC40441sG) c42501vq).A02)) {
                if (!c42501vq.A03.A0A(Environment.getExternalStorageState())) {
                    StringBuilder A0P = C000200d.A0P("wallpaper/v2/backup/sdcard_unavailable ");
                    A0P.append(Environment.getExternalStorageState());
                    Log.i(A0P.toString());
                    return;
                }
                AbstractCollection abstractCollection = (AbstractCollection) c42501vq.A09.A0E();
                HashSet hashSet = new HashSet(abstractCollection.size());
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    Uri parse = Uri.parse((String) it.next());
                    if (parse.getPath() != null) {
                        File file2 = new File(parse.getPath());
                        if (file2.exists()) {
                            hashSet.add(file2);
                        }
                    }
                }
                List A06 = c42501vq.A06();
                AnonymousClass034 anonymousClass034 = ((AbstractC40441sG) c42501vq).A04;
                if (enumC03450Ft == enumC03450Ft3) {
                    file = new File(anonymousClass034.A02(), "Wallpapers");
                } else {
                    File A02 = anonymousClass034.A02();
                    StringBuilder A0P2 = C000200d.A0P("wallpapers.backup.crypt");
                    A0P2.append(enumC03450Ft.version);
                    file = new File(A02, A0P2.toString());
                }
                Iterator it2 = ((AbstractCollection) A06).iterator();
                while (it2.hasNext()) {
                    File file3 = (File) it2.next();
                    if (!file3.equals(file) && file3.exists()) {
                        AnonymousClass024.A0g(file3);
                    }
                }
                if (enumC03450Ft3 == enumC03450Ft) {
                    File file4 = new File(anonymousClass034.A02(), "Wallpapers");
                    if (!file4.exists()) {
                        file4.mkdirs();
                    }
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        File file5 = (File) it3.next();
                        File file6 = new File(file4, file5.getName());
                        File absoluteFile = file6.getAbsoluteFile();
                        if (!absoluteFile.exists()) {
                            absoluteFile.mkdirs();
                        }
                        try {
                            FileChannel channel = new FileInputStream(file5).getChannel();
                            WritableByteChannel newChannel = Channels.newChannel(new C02D(((AbstractC40441sG) c42501vq).A05.A05, file6));
                            StringBuilder sb = new StringBuilder();
                            sb.append("wallpaper/v2/backup/size ");
                            sb.append(file5.length());
                            Log.i(sb.toString());
                            C03460Fu.A0B(channel, newChannel);
                            if (newChannel != null) {
                                newChannel.close();
                            }
                            channel.close();
                        } catch (Exception e) {
                            Log.w("wallpaper/v2/backup/error ", e);
                        }
                    }
                    return;
                }
                try {
                    C0HI A03 = C0HH.A00(enumC03450Ft, c42501vq.A0B, ((AbstractC40441sG) c42501vq).A01, c42501vq.A07, c03310Fe, ((AbstractC40441sG) c42501vq).A05, c42501vq.A0A, file).A03(context);
                    Iterator it4 = hashSet.iterator();
                    while (it4.hasNext()) {
                        File file7 = (File) it4.next();
                        if (A03 == null) {
                            Log.e("wallpaper/v2/backup failed to create writer");
                            return;
                        }
                        A03.AWI(file7);
                    }
                    if (A03 == null) {
                        return;
                    }
                    A03.close();
                    return;
                } catch (Exception e2) {
                    Log.e("wallpaper/v2/backup failed", e2);
                    return;
                }
            }
            return;
        }
        throw null;
    }

    public synchronized void A08(File file) {
        EnumC03450Ft enumC03450Ft;
        int i;
        EnumC03450Ft enumC03450Ft2;
        EnumC03450Ft enumC03450Ft3;
        File[] listFiles;
        List A05 = C03460Fu.A05(EnumC03450Ft.CRYPT14, EnumC03450Ft.A00());
        File file2 = this.A0D;
        ArrayList A04 = C03460Fu.A04(file2, A05);
        C03460Fu.A0C(A04, file2);
        ArrayList arrayList = A04;
        if (arrayList.isEmpty()) {
            Log.i("wallpaper/restore/no backups");
        } else {
            File file3 = (File) arrayList.get(0);
            if (!file3.exists()) {
                Log.i("wallpaper/restore/no backups");
            } else {
                C001200o c001200o = this.A06;
                Application application = c001200o.A00;
                File A02 = A02(application);
                File file4 = new File(application.getFilesDir(), "wallpaper.bkup");
                try {
                    int A00 = C03460Fu.A00(file3.getName(), "wallpaper.bkup");
                    if (A00 <= 0 || (enumC03450Ft = EnumC03450Ft.A02(A00)) == null) {
                        enumC03450Ft = EnumC03450Ft.UNENCRYPTED;
                    }
                    C0HN A022 = C0HH.A00(enumC03450Ft, this.A0B, this.A01, this.A07, this.A03, this.A05, this.A0A, file3).A02(c001200o, file4, 0, 0, false, null);
                    if (A022.A00 != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("wallpaper/restore/failed to restore ");
                        sb.append(A022);
                        Log.w(sb.toString());
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file4.getAbsolutePath(), options);
                        int i2 = options.outWidth;
                        WindowManager windowManager = (WindowManager) application.getSystemService("window");
                        Point point = new Point();
                        if (windowManager != null) {
                            windowManager.getDefaultDisplay().getSize(point);
                            if (application.getResources().getConfiguration().orientation == 1) {
                                i = point.x;
                            } else {
                                i = point.y;
                            }
                            if (i != i2) {
                                Log.w("wallpaper/restore skipping final rename due to size mismatch");
                            } else if (!file4.renameTo(A02)) {
                                Log.e("wallpaper/restore could not rename tmp file");
                            } else {
                                Log.i("wallpaper/restore complete");
                            }
                        } else {
                            throw null;
                        }
                    }
                } catch (Exception e) {
                    Log.w("wallpaper/restore/ioerror ", e);
                }
            }
        }
        if (C03410Fp.A08(this.A02)) {
            Set A0E = this.A09.A0E();
            final HashMap hashMap = new HashMap();
            Iterator it = ((HashSet) A0E).iterator();
            while (it.hasNext()) {
                String path = Uri.parse((String) it.next()).getPath();
                if (path != null) {
                    File file5 = new File(path);
                    hashMap.put(file5.getName(), file5);
                }
            }
            if (hashMap.isEmpty()) {
                return;
            }
            EnumC03450Ft enumC03450Ft4 = EnumC03450Ft.UNENCRYPTED;
            int A002 = C03460Fu.A00(file.getName(), "wallpapers.backup");
            if (A002 <= 0 || (enumC03450Ft2 = EnumC03450Ft.A02(A002)) == null) {
                enumC03450Ft2 = EnumC03450Ft.UNENCRYPTED;
            }
            if (enumC03450Ft4 == enumC03450Ft2) {
                if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file6 : listFiles) {
                        File file7 = (File) hashMap.get(file6.getName());
                        if (file7 != null) {
                            File parentFile = file7.getParentFile();
                            if (parentFile != null && !parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            StringBuilder A0P = C000200d.A0P("wallpaper/v2/restore/copy ");
                            A0P.append(file7.getName());
                            A0P.append(" ");
                            A0P.append(file6.length());
                            Log.i(A0P.toString());
                            try {
                                WritableByteChannel newChannel = Channels.newChannel(new FileOutputStream(file7, false));
                                try {
                                    FileChannel channel = new FileInputStream(file6).getChannel();
                                    C03460Fu.A0B(channel, newChannel);
                                    channel.close();
                                    if (newChannel != null) {
                                        newChannel.close();
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                        break;
                                    } catch (Throwable th2) {
                                        if (newChannel != null) {
                                            try {
                                                newChannel.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        throw th2;
                                        break;
                                    }
                                }
                            } catch (IOException e2) {
                                Log.w("wallpaper/v2/restore/ioerror ", e2);
                            }
                        }
                    }
                }
            }
            try {
                int A003 = C03460Fu.A00(file.getName(), "wallpapers.backup");
                if (A003 <= 0 || (enumC03450Ft3 = EnumC03450Ft.A02(A003)) == null) {
                    enumC03450Ft3 = EnumC03450Ft.UNENCRYPTED;
                }
                C0HH.A00(enumC03450Ft3, this.A0B, this.A01, this.A07, this.A03, this.A05, this.A0A, file).A06(new C0HJ() { // from class: X.3oo
                    @Override // X.C0HJ
                    public final Object A5S(Object obj) {
                        File file8 = (File) hashMap.get(obj);
                        if (file8 == null) {
                            return null;
                        }
                        File parentFile2 = file8.getParentFile();
                        if (parentFile2 == null || parentFile2.exists()) {
                            return file8;
                        }
                        parentFile2.mkdirs();
                        return file8;
                    }
                });
            } catch (Exception e3) {
                Log.w("wallpaper/v2/restore/failed ", e3);
            }
        }
    }

    public boolean A09() {
        if (!(this instanceof C42501vq)) {
            C42511vr c42511vr = (C42511vr) this;
            return c42511vr.A08.A03("wallpaper", A02(((AbstractC40441sG) c42511vr).A06.A00)) == 19;
        }
        C42501vq c42501vq = (C42501vq) this;
        boolean A09 = c42501vq.A04.A09();
        c42501vq.A0F();
        return A09;
    }

    public Drawable A0A(C42571vx c42571vx) {
        if (c42571vx == null) {
            return null;
        }
        return c42571vx.A00;
    }
}
