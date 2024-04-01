package com.whatsapp.settings.chat.wallpaper;

import X.AbstractC40441sG;
import X.ActivityC02290Ap;
import X.AnonymousClass012;
import X.C000200d;
import X.C000400f;
import X.C002701i;
import X.C02E;
import X.C02L;
import X.C03410Fp;
import X.C05U;
import X.C05V;
import X.C0DD;
import X.C0DH;
import X.C0JJ;
import X.C2Pa;
import X.C2Z1;
import X.C41961un;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class GalleryWallpaperPreview extends C2Pa {
    public int A00;
    public Uri A01;
    public C02L A02;
    public C000400f A03;
    public C02E A04;
    public AnonymousClass012 A05;
    public PhotoView A06;
    public C05U A07;
    public AbstractC40441sG A08;
    public C41961un A09;

    public /* synthetic */ void lambda$onCreate$2379$GalleryWallpaperPreview(View view) {
        setResult(0);
        finish();
    }

    @Override // X.C2Pa, X.C2PT, X.C2PU, X.C2PR, X.C2PS, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06 = (PhotoView) findViewById(R.id.wallpaper_photo_view);
        findViewById(R.id.cancel_button).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 13));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.preview_content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C0JJ c0jj = (C0JJ) this.A07.A02(C05V.A00(this.A05, this.A02, null, false), this.A05.A05(), (byte) 0);
        if (C03410Fp.A08(((ActivityC02290Ap) this).A0B)) {
            c0jj.A0l(getString(R.string.wallpaper_bubble_pinch_and_drag));
        } else {
            c0jj.A0l(getString(R.string.wallpaper_pinch_to_zoom));
        }
        C05U c05u = this.A07;
        AnonymousClass012 anonymousClass012 = this.A05;
        C02L c02l = this.A02;
        c02l.A05();
        C0JJ c0jj2 = (C0JJ) c05u.A02(C05V.A00(anonymousClass012, c02l, c02l.A03, true), this.A05.A05(), (byte) 0);
        if (C03410Fp.A08(((ActivityC02290Ap) this).A0B)) {
            c0jj2.A0l(A1P());
        } else {
            c0jj2.A0l(getString(R.string.wallpaper_drag_to_position));
        }
        c0jj2.A0Y(5);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setBackgroundResource(0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        C2Z1 c2z1 = new C2Z1(this, c0jj) { // from class: X.2Z0
            @Override // X.AbstractC48202Eh, android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // X.AbstractC48202Eh, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        c2z1.A0d(true);
        c2z1.setEnabled(false);
        c2z1.setClickable(false);
        C2Z1 c2z12 = new C2Z1(this, c0jj2) { // from class: X.2Z0
            @Override // X.AbstractC48202Eh, android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // X.AbstractC48202Eh, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        c2z12.A0d(false);
        c2z12.setEnabled(false);
        c2z12.setClickable(false);
        linearLayout.addView(c2z1);
        linearLayout.addView(c2z12);
        linearLayout.setClickable(false);
        viewGroup.addView(linearLayout);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.A01 = (Uri) extras.getParcelable("output");
            this.A00 = extras.getInt("maxFileSize", 0);
        }
        Uri data = getIntent().getData();
        if (data == null) {
            Log.e("gallerywallpaperpreview/no uri found in intent");
            setResult(0, new Intent().putExtra("io-error", true));
            finish();
            return;
        }
        try {
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            InputStream A0e = this.A09.A0e(data);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inDither = true;
                Bitmap bitmap = C002701i.A0M(A0e, new C0DH(point.x, point.y, null, false, options)).A02;
                if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
                    Matrix A0A = C0DD.A0A(this.A04.A07(), data);
                    if (A0A == null) {
                        A0A = new Matrix();
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), A0A, true);
                    if (bitmap != createBitmap) {
                        bitmap.recycle();
                    }
                    Bitmap bitmap2 = createBitmap;
                    Point point2 = new Point();
                    getWindowManager().getDefaultDisplay().getSize(point2);
                    float max = Math.max(point2.x / createBitmap.getWidth(), point2.y / createBitmap.getHeight());
                    if (max > 1.0f) {
                        StringBuilder sb = new StringBuilder("gallerywallpaperpreview/scaling image by ");
                        sb.append(max);
                        sb.append("x to fit screen");
                        Log.i(sb.toString());
                        bitmap2 = Bitmap.createScaledBitmap(createBitmap, (int) (createBitmap.getWidth() * max), (int) (createBitmap.getHeight() * max), true);
                    }
                    if (bitmap2 != createBitmap) {
                        createBitmap.recycle();
                    }
                    if (bitmap2 != null && bitmap2.getWidth() != 0 && bitmap2.getHeight() != 0) {
                        StringBuilder A0P = C000200d.A0P("gallerywallpaperpreview/wallpaper loaded/w=");
                        A0P.append(bitmap2.getWidth());
                        A0P.append("; h=");
                        A0P.append(bitmap2.getHeight());
                        Log.i(A0P.toString());
                        PhotoView photoView = this.A06;
                        photoView.A0Y = true;
                        if (1 == 0) {
                            photoView.A02();
                        }
                        PhotoView photoView2 = this.A06;
                        photoView2.A09 = 3;
                        photoView2.setAllowFullViewCrop(true);
                        this.A06.A06(bitmap2);
                        return;
                    }
                    Log.e("gallerywallpaperpreview/failed to load bitmap");
                    setResult(0, new Intent().putExtra("not-a-image", true));
                    finish();
                    return;
                }
                Log.e("gallerywallpaperpreview/failed to load bitmap");
                if (bitmap != null) {
                    bitmap.recycle();
                }
                setResult(0, new Intent().putExtra("not-a-image", true));
                finish();
            } finally {
            }
        } catch (IOException e) {
            Log.e("gallerywallpaperpreview/io error loading wallpaper", e);
            setResult(0, new Intent().putExtra("io-error", true));
            finish();
        } catch (OutOfMemoryError e2) {
            Log.e("gallerywallpaperpreview/out of memory trying to load wallpaper", e2);
            setResult(0, new Intent().putExtra("error-oom", true));
            finish();
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }
}
