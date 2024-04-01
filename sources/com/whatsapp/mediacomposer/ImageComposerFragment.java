package com.whatsapp.mediacomposer;

import X.AbstractC04890Mh;
import X.ActivityC02290Ap;
import X.ActivityC02330At;
import X.C000500h;
import X.C002301c;
import X.C011605s;
import X.C012005w;
import X.C01B;
import X.C01C;
import X.C02A;
import X.C02E;
import X.C08930cL;
import X.C0BA;
import X.C0DD;
import X.C2EN;
import X.C40841sx;
import X.C41961un;
import X.C42671w8;
import X.C44011yN;
import X.C48702Gi;
import X.C48722Gk;
import X.C48732Gl;
import X.C48742Gm;
import X.C52132a7;
import X.C63512zu;
import X.C67623Gf;
import X.InterfaceC002901k;
import X.InterfaceC61152vg;
import X.InterfaceC61162vh;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.crop.CropImage;
import com.whatsapp.gallerypicker.OnZoomListenerPhotoView;
import com.whatsapp.mediacomposer.Hilt_ImageComposerFragment;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class ImageComposerFragment extends Hilt_ImageComposerFragment {
    public C012005w A00;
    public C01B A01;
    public C011605s A02;
    public C02E A03;
    public C000500h A04;
    public C002301c A05;
    public C44011yN A06;
    public OnZoomListenerPhotoView A07;
    public ImagePreviewContentLayout A08;
    public C48702Gi A09;
    public C41961un A0A;
    public InterfaceC002901k A0B;
    public boolean A0C;

    public static File A00(C012005w c012005w, Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(C02A.A01(uri.toString()));
        sb.append("-crop");
        return c012005w.A0L(sb.toString());
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment, X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        int parseInt;
        if (i != 1) {
            super.A0h(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            OnZoomListenerPhotoView onZoomListenerPhotoView = this.A07;
            onZoomListenerPhotoView.A0J = null;
            onZoomListenerPhotoView.A04 = 0.0f;
            C48702Gi c48702Gi = this.A09;
            c48702Gi.A04 = null;
            c48702Gi.A0R.A04(c48702Gi.A0X);
            Rect rect = (Rect) intent.getParcelableExtra("rect");
            int intExtra = intent.getIntExtra("rotate", 0);
            int ACv = A0y().ACv(((MediaComposerFragment) this).A00);
            File A00 = A00(this.A00, ((MediaComposerFragment) this).A00);
            Uri fromFile = Uri.fromFile(A00);
            A0y().ASv(((MediaComposerFragment) this).A00, A00, rect, (ACv + intExtra) % 360);
            if (((MediaComposerFragment) this).A00.getQueryParameter("flip-h") != null) {
                fromFile = fromFile.buildUpon().appendQueryParameter("flip-h", "1").build();
            }
            int A17 = A17();
            if (A17 != 0) {
                fromFile = fromFile.buildUpon().appendQueryParameter("rotation", Integer.toString(A17)).build();
            }
            try {
                int A07 = this.A01.A07(C01C.A3A);
                Bitmap A0Z = this.A0A.A0Z(fromFile, A07, A07);
                C48702Gi c48702Gi2 = this.A09;
                c48702Gi2.A05 = A0Z;
                c48702Gi2.A0C = false;
                c48702Gi2.A02();
                C48702Gi c48702Gi3 = this.A09;
                c48702Gi3.A04();
                C48732Gl c48732Gl = c48702Gi3.A0B;
                if (c48732Gl != null) {
                    ((AbstractC04890Mh) c48732Gl).A01.A00();
                } else if (1 != 0) {
                    Handler handler = c48702Gi3.A0M;
                    Runnable runnable = c48702Gi3.A0W;
                    handler.removeCallbacks(runnable);
                    runnable.run();
                }
                Bitmap bitmap = this.A09.A04;
                if (bitmap == null) {
                    Log.e("ImageComposerFragment/cropImage/nullbitmap");
                    ((MediaComposerFragment) this).A01.A07(R.string.error_load_image, 1);
                    return;
                }
                this.A07.A06(bitmap);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    Uri fromFile2 = Uri.fromFile(A0y().AAB(((MediaComposerFragment) this).A00));
                    InputStream A0e = this.A0A.A0e(fromFile2);
                    BitmapFactory.decodeStream(A0e, null, options);
                    A0e.close();
                    RectF rectF = new RectF(0.0f, 0.0f, options.outWidth, options.outHeight);
                    Matrix A0A = C0DD.A0A(this.A03.A07(), fromFile2);
                    if (A0A == null) {
                        A0A = new Matrix();
                    }
                    String queryParameter = ((MediaComposerFragment) this).A00.getQueryParameter("rotation");
                    if (queryParameter != null && (parseInt = Integer.parseInt(queryParameter)) != 0) {
                        A0A.postRotate(parseInt);
                    }
                    A0A.mapRect(rectF);
                    float f = rectF.left;
                    float f2 = rectF.top;
                    RectF rectF2 = new RectF(rect);
                    A0A.mapRect(rectF2);
                    rectF2.offset(-f, -f2);
                    float width = (((MediaComposerFragment) this).A0A.A0H.A06.width() * 1.0f) / rectF.width();
                    rectF2.left *= width;
                    rectF2.top *= width;
                    rectF2.right *= width;
                    rectF2.bottom *= width;
                    ((MediaComposerFragment) this).A0A.A06(rectF2);
                    C48742Gm c48742Gm = ((MediaComposerFragment) this).A0A;
                    C63512zu c63512zu = c48742Gm.A0H;
                    int i3 = (c63512zu.A02 + intExtra) % 360;
                    c63512zu.A02 = i3;
                    RectF rectF3 = c63512zu.A07;
                    if (rectF3 != null) {
                        C40841sx.A07(i3, rectF3, c63512zu.A09);
                    }
                    DoodleView doodleView = c48742Gm.A0G;
                    doodleView.requestLayout();
                    c48742Gm.A0F.A0D = false;
                    doodleView.invalidate();
                } catch (IOException unused) {
                    CropImage.A00(((MediaComposerFragment) this).A01, intent, (ActivityC02290Ap) A09());
                }
            } catch (C42671w8 | IOException | OutOfMemoryError e) {
                Log.e("ImageComposerFragment/cropImage", e);
                ((MediaComposerFragment) this).A01.A07(R.string.error_load_image, 1);
                return;
            }
        } else if (i2 == 0) {
            if (intent != null) {
                ActivityC02330At A09 = A09();
                if (A09 != null) {
                    CropImage.A00(((MediaComposerFragment) this).A01, intent, (ActivityC02290Ap) A09);
                }
            } else {
                A18(null);
            }
        }
        this.A0C = false;
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        bundle.putBoolean("handle-crop-image-result", this.A0C);
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.image_composer_fragment, viewGroup, false);
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment, X.C0BA
    public void A0r() {
        this.A08.A00();
        C48702Gi c48702Gi = this.A09;
        c48702Gi.A05 = null;
        c48702Gi.A04 = null;
        c48702Gi.A03 = null;
        View view = c48702Gi.A0N;
        if (view != null) {
            ((C08930cL) view.getLayoutParams()).A00(null);
        }
        BottomSheetBehavior bottomSheetBehavior = c48702Gi.A09;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0E = null;
        }
        c48702Gi.A03();
        super.A0r();
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment, X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0w(view, bundle);
        this.A09 = new C48702Gi(this.A02, this.A0B, this.A06, this.A05, this.A04, A09(), view, ((MediaComposerFragment) this).A00, new C48722Gk(this), A0y().AAE(((MediaComposerFragment) this).A00), ((MediaComposerFragment) this).A0A);
        this.A07 = (OnZoomListenerPhotoView) view.findViewById(R.id.photo);
        ImagePreviewContentLayout imagePreviewContentLayout = (ImagePreviewContentLayout) view.findViewById(R.id.media_content);
        this.A08 = imagePreviewContentLayout;
        C48742Gm c48742Gm = ((MediaComposerFragment) this).A0A;
        imagePreviewContentLayout.A03 = c48742Gm;
        c48742Gm.A0G.A0C = false;
        imagePreviewContentLayout.A04 = new C67623Gf(this);
        imagePreviewContentLayout.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 40));
        if (bundle == null || !bundle.getBoolean("handle-crop-image-result", false)) {
            A18(bundle);
        }
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment
    public void A13(Rect rect) {
        View view = ((C0BA) this).A0A;
        if (view != null) {
            View findViewById = view.findViewById(R.id.doodle_decoration);
            if (findViewById != null) {
                findViewById.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            }
            C48702Gi c48702Gi = this.A09;
            if (rect.equals(c48702Gi.A06)) {
                return;
            }
            c48702Gi.A06 = new Rect(0, rect.top, 0, rect.bottom);
        }
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment
    public boolean A15() {
        return this.A09.A09() || super.A15();
    }

    public final int A17() {
        int i;
        String queryParameter = ((MediaComposerFragment) this).A00.getQueryParameter("rotation");
        if (queryParameter != null) {
            i = Integer.parseInt(queryParameter);
        } else {
            i = 0;
        }
        return (A0y().ACv(((MediaComposerFragment) this).A00) + i) % 360;
    }

    public final void A18(final Bundle bundle) {
        this.A07.setTag(((MediaComposerFragment) this).A00);
        final C2EN A0y = A0y();
        File A9H = A0y.A9H(((MediaComposerFragment) this).A00);
        if (A9H == null) {
            A9H = A0y.AAB(((MediaComposerFragment) this).A00);
        }
        Uri.Builder buildUpon = Uri.fromFile(A9H).buildUpon();
        int A17 = A17();
        if (A17 != 0) {
            buildUpon.appendQueryParameter("rotation", Integer.toString(A17));
        }
        if (((MediaComposerFragment) this).A00.getQueryParameter("flip-h") != null) {
            buildUpon.appendQueryParameter("flip-h", ((MediaComposerFragment) this).A00.getQueryParameter("flip-h"));
        }
        final Uri build = buildUpon.build();
        InterfaceC61152vg interfaceC61152vg = new InterfaceC61152vg() { // from class: X.3Gd
            {
                ImageComposerFragment.this = this;
            }

            @Override // X.InterfaceC61152vg
            public String ADR() {
                return ((MediaComposerFragment) ImageComposerFragment.this).A00.toString();
            }

            @Override // X.InterfaceC61152vg
            public Bitmap AG1() {
                try {
                    ImageComposerFragment imageComposerFragment = ImageComposerFragment.this;
                    int A07 = imageComposerFragment.A01.A07(C01C.A3A);
                    Bitmap A0Z = imageComposerFragment.A0A.A0Z(build, A07, A07);
                    C48702Gi c48702Gi = imageComposerFragment.A09;
                    c48702Gi.A05 = A0Z;
                    c48702Gi.A0C = false;
                    c48702Gi.A02();
                    return A0Z;
                } catch (C42671w8 | IOException | OutOfMemoryError e) {
                    Log.e("ImageComposerFragment/loadbitmap", e);
                    return null;
                }
            }
        };
        InterfaceC61162vh interfaceC61162vh = new InterfaceC61162vh() { // from class: X.3Ge
            @Override // X.InterfaceC61162vh
            public /* synthetic */ void A5d() {
            }

            {
                ImageComposerFragment.this = this;
            }

            @Override // X.InterfaceC61162vh
            public void AKC() {
                ActivityC02330At A09 = ImageComposerFragment.this.A09();
                if (A09 != null) {
                    A09.A0T();
                }
            }

            @Override // X.InterfaceC61162vh
            public void APF(Bitmap bitmap, boolean z) {
                ImageComposerFragment imageComposerFragment = ImageComposerFragment.this;
                ContextWrapper contextWrapper = ((Hilt_ImageComposerFragment) imageComposerFragment).A00;
                if (contextWrapper != null) {
                    Object tag = imageComposerFragment.A07.getTag();
                    Uri uri = ((MediaComposerFragment) imageComposerFragment).A00;
                    if (tag == uri) {
                        if (bundle == null) {
                            C2EN c2en = A0y;
                            String A9p = c2en.A9p(uri);
                            String A9s = c2en.A9s(((MediaComposerFragment) imageComposerFragment).A00);
                            if (A9p == null) {
                                if (!(!((MediaComposerFragment) imageComposerFragment).A0A.A0M.A04.isEmpty())) {
                                    RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                                    C48742Gm c48742Gm = ((MediaComposerFragment) imageComposerFragment).A0A;
                                    c48742Gm.A0H.A06 = rectF;
                                    c48742Gm.A0G.A00 = 0.0f;
                                    c48742Gm.A06(rectF);
                                }
                            } else {
                                C2EK A03 = C2EK.A03(A9p, contextWrapper, ((MediaComposerFragment) imageComposerFragment).A05, imageComposerFragment.A05, ((MediaComposerFragment) imageComposerFragment).A0E);
                                if (A03 != null) {
                                    ((MediaComposerFragment) imageComposerFragment).A0A.A07(A03, A9s);
                                }
                            }
                        }
                        if (!z) {
                            imageComposerFragment.A07.A06(imageComposerFragment.A09.A04);
                            ActivityC02330At A09 = imageComposerFragment.A09();
                            if (A09 != null) {
                                A09.A0T();
                            }
                        } else {
                            C48702Gi c48702Gi = imageComposerFragment.A09;
                            if (bitmap != null) {
                                c48702Gi.A05 = bitmap;
                                c48702Gi.A0C = false;
                            }
                            c48702Gi.A05(c48702Gi.A02, null, new RunnableEBaseShape8S0100000_I1_0(c48702Gi, 43));
                        }
                        C48702Gi c48702Gi2 = imageComposerFragment.A09;
                        c48702Gi2.A04();
                        C48732Gl c48732Gl = c48702Gi2.A0B;
                        if (c48732Gl != null) {
                            ((AbstractC04890Mh) c48732Gl).A01.A00();
                        } else if (0 == 0) {
                        } else {
                            Handler handler = c48702Gi2.A0M;
                            Runnable runnable = c48702Gi2.A0W;
                            handler.removeCallbacks(runnable);
                            runnable.run();
                        }
                    }
                }
            }
        };
        C52132a7 ABC = A0y.ABC();
        if (ABC != null) {
            ABC.A02(interfaceC61152vg, interfaceC61162vh);
        }
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment, X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final C48702Gi c48702Gi = this.A09;
        if (c48702Gi.A09 != null) {
            c48702Gi.A0P.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.30q
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    C48702Gi c48702Gi2 = c48702Gi;
                    c48702Gi2.A0P.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    C48702Gi.A00(c48702Gi2);
                    C48732Gl c48732Gl = c48702Gi2.A0B;
                    if (c48732Gl != null) {
                        ((AbstractC04890Mh) c48732Gl).A01.A00();
                    }
                }
            });
        }
    }
}
