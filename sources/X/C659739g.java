package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.crop.CropImage;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.39g */
/* loaded from: classes2.dex */
public final class C659739g implements InterfaceC09820eo {
    public final Activity A00;
    public final C0B5 A01;
    public final C018508q A02;
    public final C01B A03;
    public final InterfaceC59442sl A04;
    public final C59452sm A05;
    public final C02E A06;
    public final AbstractC40441sG A07;

    public C659739g(Activity activity, C018508q c018508q, C01B c01b, C02E c02e, AbstractC40441sG abstractC40441sG, C0B5 c0b5, InterfaceC59442sl interfaceC59442sl, C59452sm c59452sm) {
        this.A00 = activity;
        this.A02 = c018508q;
        this.A03 = c01b;
        this.A06 = c02e;
        this.A07 = abstractC40441sG;
        this.A01 = c0b5;
        this.A04 = interfaceC59442sl;
        this.A05 = c59452sm;
    }

    public final void A00(AbstractC005302j abstractC005302j, Uri uri, int i, int i2, int i3, boolean z) {
        AbstractC40441sG abstractC40441sG;
        Activity activity;
        C42571vx A05;
        if (uri != null) {
            abstractC40441sG = this.A07;
            activity = this.A00;
            A05 = abstractC40441sG.A05(abstractC005302j, activity, uri, z, 0, 0);
        } else if (i == -1) {
            abstractC40441sG = this.A07;
            activity = this.A00;
            A05 = abstractC40441sG.A05(abstractC005302j, activity, null, z, 0, 0);
        } else {
            abstractC40441sG = this.A07;
            activity = this.A00;
            if (!(abstractC40441sG instanceof C42501vq)) {
                C42511vr c42511vr = (C42511vr) abstractC40441sG;
                C000200d.A0t("wallpaper/set with resId with size (width x height): ", i2, "x", i3);
                Drawable A02 = C03410Fp.A02(c42511vr.A04, activity, i, i2, i3);
                c42511vr.A00 = A02;
                if (A02 != null) {
                    c42511vr.A0C(activity, A02);
                }
                A05 = new C42571vx(c42511vr.A00);
            } else {
                C42501vq c42501vq = (C42501vq) abstractC40441sG;
                Drawable A022 = C03410Fp.A02(c42501vq.A01, activity, i, i2, i3);
                if (A022 == null) {
                    A05 = c42501vq.A04(abstractC005302j, activity);
                } else {
                    A05 = c42501vq.A0C(c42501vq.A0E(abstractC005302j, activity, (BitmapDrawable) A022), activity, abstractC005302j == null);
                }
            }
        }
        this.A04.AUA(abstractC40441sG.A0A(A05));
        if (z) {
            C0DD.A0N(activity, uri);
        }
    }

    @Override // X.InterfaceC09820eo
    public boolean onActivityResult(int i, int i2, Intent intent) {
        C59452sm c59452sm = this.A05;
        int i3 = c59452sm.A00;
        if (i == i3) {
            if (i2 == -1) {
                if (intent != null && intent.getData() != null) {
                    A00(C03410Fp.A05(intent), intent.getData(), -1, 0, 0, true);
                }
            } else if (i2 == 0 && intent != null) {
                CropImage.A00(this.A02, intent, this.A01);
                return true;
            }
            return true;
        } else if (i == c59452sm.A01) {
            if (i2 == -1 && intent != null) {
                AbstractC005302j A05 = C03410Fp.A05(intent);
                boolean booleanExtra = intent.getBooleanExtra("is_using_global_wallpaper", false);
                Activity activity = this.A00;
                Point A00 = AbstractC40441sG.A00(activity);
                if (intent.getData() != null) {
                    StringBuilder A0P = C000200d.A0P("conversation/wallpaper/setup/src:");
                    A0P.append(intent.getData().toString());
                    Log.i(A0P.toString());
                    ContentResolver A07 = this.A06.A07();
                    if (intent.getBooleanExtra("FROM_INTERNAL_DOWNLOADS_KEY", false)) {
                        A00(A05, intent.getData(), -1, 0, 0, false);
                        return true;
                    }
                    if (A07 == null) {
                        Log.w("conversation/wallpaper/setup cr=null");
                    } else {
                        Cursor query = A07.query(intent.getData(), null, null, null, null);
                        if (query != null) {
                            try {
                                boolean moveToFirst = query.moveToFirst();
                                int columnIndex = query.getColumnIndex("bucket_display_name");
                                if (moveToFirst && columnIndex >= 0 && "WallPaper".equals(query.getString(columnIndex))) {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    try {
                                        InputStream openInputStream = A07.openInputStream(intent.getData());
                                        try {
                                            BitmapFactory.decodeStream(openInputStream, null, options);
                                            if (options.outWidth == A00.x && options.outHeight == A00.y) {
                                                A00(A05, intent.getData(), -1, 0, 0, true);
                                                if (openInputStream != null) {
                                                    openInputStream.close();
                                                }
                                                query.close();
                                                return true;
                                            } else if (openInputStream != null) {
                                                openInputStream.close();
                                            }
                                        } finally {
                                        }
                                    } catch (FileNotFoundException e) {
                                        Log.e(e);
                                    } catch (IOException e2) {
                                        Log.e(e2);
                                    }
                                }
                                query.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        query.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th2;
                                }
                            }
                        }
                    }
                    Uri data = intent.getData();
                    Uri A03 = this.A07.A03();
                    Intent intent2 = new Intent(activity, GalleryWallpaperPreview.class);
                    intent2.setData(data);
                    intent2.putExtra("output", A03);
                    intent2.putExtra("chat_jid", A05);
                    intent2.putExtra("is_using_global_wallpaper", booleanExtra);
                    activity.startActivityForResult(intent2, i3);
                    this.A04.AWF();
                    return !this.A03.A0E(C01C.A2W);
                }
                InterfaceC59442sl interfaceC59442sl = this.A04;
                interfaceC59442sl.A6D();
                int intExtra = intent.getIntExtra("selected_res_id", 0);
                if (intExtra != 0) {
                    StringBuilder A0Q = C000200d.A0Q("conversation/wallpaper from pgk:", intExtra, " [");
                    A0Q.append(A00.x);
                    A0Q.append(",");
                    A0Q.append(A00.y);
                    A0Q.append("]");
                    Log.i(A0Q.toString());
                    A00(A05, null, intExtra, A00.x, A00.y, true);
                } else if (intent.hasExtra("wallpaper_color_file")) {
                    int intExtra2 = intent.getIntExtra("wallpaper_color_file", 0);
                    boolean booleanExtra2 = intent.getBooleanExtra("wallpaper_doodle_overlay", false);
                    AbstractC40441sG abstractC40441sG = this.A07;
                    if (!(abstractC40441sG instanceof C42501vq)) {
                        C42511vr c42511vr = (C42511vr) abstractC40441sG;
                        c42511vr.A00 = null;
                        try {
                            FileOutputStream openFileOutput = activity.openFileOutput("wallpaper.jpg", 0);
                            openFileOutput.write(4);
                            openFileOutput.write(intExtra2);
                            openFileOutput.flush();
                            openFileOutput.close();
                        } catch (IOException e3) {
                            Log.e(e3);
                        }
                        c42511vr.A00 = c42511vr.A0A(c42511vr.A0B(activity, false));
                        ((AbstractC40441sG) c42511vr).A00 = true;
                    } else {
                        ((C42501vq) abstractC40441sG).A0G(A05, new C03380Fm(booleanExtra2 ? "COLOR_WITH_WA_OVERLAY" : "COLOR_ONLY", String.valueOf(intExtra2), 0), activity);
                    }
                    interfaceC59442sl.AUA(abstractC40441sG.A0A(abstractC40441sG.A04(A05, activity)));
                } else if (intent.getBooleanExtra("is_reset", false)) {
                    AbstractC40441sG abstractC40441sG2 = this.A07;
                    if (!(abstractC40441sG2 instanceof C42501vq)) {
                        C42511vr c42511vr2 = (C42511vr) abstractC40441sG2;
                        Log.i("wallpaper/reset");
                        c42511vr2.A00 = null;
                        try {
                            FileOutputStream openFileOutput2 = activity.openFileOutput("wallpaper.jpg", 0);
                            openFileOutput2.write(3);
                            openFileOutput2.flush();
                            openFileOutput2.close();
                        } catch (IOException e4) {
                            Log.e(e4);
                        }
                        c42511vr2.A07(activity);
                    } else {
                        ((C42501vq) abstractC40441sG2).A0G(A05, new C03380Fm("NONE", null, 0), activity);
                    }
                    interfaceC59442sl.AUA(null);
                    Log.i("conversation/wallpaper/reset");
                } else if (intent.getBooleanExtra("is_default", false)) {
                    AbstractC40441sG abstractC40441sG3 = this.A07;
                    if (!(abstractC40441sG3 instanceof C42501vq)) {
                        C42511vr c42511vr3 = (C42511vr) abstractC40441sG3;
                        Log.i("wallpaper/default");
                        c42511vr3.A00 = null;
                        try {
                            FileOutputStream openFileOutput3 = activity.openFileOutput("wallpaper.jpg", 0);
                            openFileOutput3.write(2);
                            openFileOutput3.flush();
                            openFileOutput3.close();
                        } catch (IOException e5) {
                            Log.e(e5);
                        }
                        c42511vr3.A00 = c42511vr3.A0A(c42511vr3.A0B(activity, false));
                        c42511vr3.A07(activity);
                    } else {
                        ((C42501vq) abstractC40441sG3).A0G(A05, new C03380Fm("DEFAULT", null, 0), activity);
                    }
                    interfaceC59442sl.AUA(abstractC40441sG3.A0A(abstractC40441sG3.A04(A05, activity)));
                    Log.i("conversation/wallpaper/default");
                } else {
                    this.A02.A07(R.string.error_wallpaper_invalid_file, 0);
                    StringBuilder sb = new StringBuilder("conversation/wallpaper/invalid_file:");
                    sb.append(intent.toString());
                    Log.e(sb.toString());
                }
            }
            this.A04.AWF();
            return true;
        } else {
            return false;
        }
    }
}
