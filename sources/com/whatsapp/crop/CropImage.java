package com.whatsapp.crop;

import X.C000400f;
import X.C002701i;
import X.C018508q;
import X.C02E;
import X.C03230Ew;
import X.C0B5;
import X.C2KQ;
import X.C2Nk;
import X.C40081rY;
import X.C41961un;
import X.C43791xz;
import X.C44011yN;
import X.C462626b;
import X.C59832tU;
import X.InterfaceC002901k;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class CropImage extends C2Nk {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Bitmap A0B;
    public Matrix A0C;
    public Matrix A0D;
    public Rect A0E;
    public Uri A0F;
    public C018508q A0G;
    public C03230Ew A0H;
    public C000400f A0I;
    public C02E A0J;
    public C462626b A0K;
    public CropImageView A0L;
    public C2KQ A0M;
    public C44011yN A0N;
    public C40081rY A0O;
    public C43791xz A0P;
    public C41961un A0Q;
    public InterfaceC002901k A0R;
    public String A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public Bitmap.CompressFormat A0A = Bitmap.CompressFormat.JPEG;
    public boolean A0Y = true;
    public int A09 = 1;

    public static void A00(C018508q c018508q, Intent intent, C0B5 c0b5) {
        if (intent.getBooleanExtra("error-oom", false)) {
            Log.e("profileinfo/activityres/oom-error");
            c018508q.A0C(c0b5, R.string.error_out_of_memory);
        } else if (intent.getBooleanExtra("no-space", false)) {
            Log.e("profileinfo/activityres/no-space");
            c018508q.A0C(c0b5, R.string.error_no_disc_space);
        } else if (intent.getBooleanExtra("io-error", false)) {
            Log.e("profileinfo/activityres/fail/load-image");
            c018508q.A0C(c0b5, R.string.error_load_image);
        } else if (!intent.getBooleanExtra("not-a-image", false)) {
        } else {
            Log.e("profileinfo/activityres/fail/not-a-image");
            c018508q.A0C(c0b5, R.string.error_file_is_not_a_image);
        }
    }

    public final void A0o(Rect rect) {
        int i = rect.left;
        int i2 = this.A09;
        rect.left = i * i2;
        rect.right *= i2;
        rect.top *= i2;
        rect.bottom *= i2;
    }

    public /* synthetic */ void lambda$onCreate$1703$CropImage(View view) {
        setResult(0);
        finish();
    }

    /* JADX WARN: Finally extract failed */
    public void lambda$onCreate$1704$CropImage(View view) {
        int i;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i2;
        int width;
        int height;
        if (this.A0M != null && !this.A0W) {
            this.A0W = true;
            this.A0L.setEnabled(false);
            CropImageView cropImageView = this.A0L;
            cropImageView.A05.clear();
            cropImageView.A05(new C59832tU(null), true);
            this.A0L.A04 = true;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            Rect A01 = this.A0M.A01();
            int i3 = this.A06;
            if (i3 != 0 && (i2 = this.A07) != 0) {
                int i4 = this.A09;
                if (i4 > 1) {
                    A01.left *= i4;
                    A01.right *= i4;
                    A01.top *= i4;
                    A01.bottom *= i4;
                }
                if (!this.A0Y && A01.width() < this.A06) {
                    i3 = A01.width();
                    i2 = A01.height();
                }
                int A02 = C002701i.A02(A01.width(), A01.height(), this.A06, this.A07, 1);
                A01.left /= A02;
                A01.right /= A02;
                A01.top /= A02;
                A01.bottom /= A02;
                if (this.A09 > 1 || A02 > 1 || getIntent().hasExtra("doodle") || getIntent().getIntExtra("filter", 0) != 0) {
                    this.A0B.recycle();
                    this.A0B = null;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = false;
                    options.inScaled = false;
                    options.inDither = true;
                    options.inPreferQualityOverSpeed = true;
                    for (int i5 = A02; i5 <= Math.max(this.A09, A02); i5 <<= 1) {
                        options.inSampleSize = i5;
                        try {
                            InputStream A0e = this.A0Q.A0e(getIntent().getData());
                            this.A0B = BitmapFactory.decodeStream(A0e, null, options);
                            A0e.close();
                            break;
                        } catch (IOException e) {
                            Log.e("cropimage/cannot_resample: ", e);
                            setResult(0, new Intent().putExtra("io-error", true));
                            finish();
                            return;
                        } catch (OutOfMemoryError e2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("cropimage/oom: ");
                            sb.append(i5);
                            Log.e(sb.toString(), e2);
                            Bitmap bitmap3 = this.A0B;
                            if (bitmap3 != null && !bitmap3.isRecycled()) {
                                this.A0B.recycle();
                                this.A0B = null;
                            }
                            A01.left >>= 1;
                            A01.right >>= 1;
                            A01.top >>= 1;
                            A01.bottom >>= 1;
                        }
                    }
                }
                Bitmap bitmap4 = this.A0B;
                if (bitmap4 == null) {
                    setResult(0, new Intent().putExtra("error-oom", true));
                    finish();
                    return;
                }
                Bitmap.Config config = bitmap4.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                bitmap = Bitmap.createBitmap(i3, i2, config);
                Canvas canvas = new Canvas(bitmap);
                RectF rectF = new RectF(0.0f, 0.0f, i3, i2);
                if (!this.A0X) {
                    A01.inset(Math.max(0, ((int) (A01.width() - rectF.width())) >> 1), Math.max(0, ((int) (A01.height() - rectF.height())) >> 1));
                    rectF.inset(Math.max(0, -width), Math.max(0, -height));
                }
                if (this.A0D != null && this.A0V) {
                    Matrix matrix = new Matrix();
                    matrix.preTranslate((-(rectF.left + rectF.right)) / 2.0f, (-(rectF.top + rectF.bottom)) / 2.0f);
                    matrix.postConcat(this.A0D);
                    matrix.postRotate(this.A08);
                    matrix.postTranslate((rectF.left + rectF.right) / 2.0f, (rectF.top + rectF.bottom) / 2.0f);
                    matrix.mapRect(rectF);
                    canvas.setMatrix(matrix);
                }
                canvas.drawBitmap(this.A0B, A01, rectF, paint);
            } else {
                if (this.A09 > 1) {
                    A0o(A01);
                }
                if (this.A03 != 0) {
                    i = 1;
                    while (true) {
                        if ((A01.width() >> 1) <= this.A03 && (A01.height() >> 1) <= this.A03) {
                            break;
                        }
                        i <<= 1;
                        A01.left >>= 1;
                        A01.right >>= 1;
                        A01.top >>= 1;
                        A01.bottom >>= 1;
                    }
                } else {
                    i = 1;
                }
                if (this.A09 > 1 || i > 1 || getIntent().hasExtra("doodle") || getIntent().getIntExtra("filter", 0) != 0) {
                    this.A0B.recycle();
                    bitmap = null;
                    this.A0B = null;
                    int i6 = i;
                    while (true) {
                        if (i6 > Math.max(this.A09, i)) {
                            break;
                        }
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i6;
                        options2.inJustDecodeBounds = false;
                        options2.inScaled = false;
                        options2.inDither = true;
                        options2.inPreferQualityOverSpeed = true;
                        try {
                            InputStream A0e2 = this.A0Q.A0e(getIntent().getData());
                            try {
                                this.A0B = BitmapFactory.decodeStream(A0e2, null, options2);
                                int width2 = A01.width();
                                int height2 = A01.height();
                                int i7 = this.A03;
                                if (i7 != 0 && (width2 > i7 || height2 > i7)) {
                                    if (width2 > height2) {
                                        height2 = (height2 * i7) / width2;
                                        width2 = i7;
                                    } else {
                                        width2 = (width2 * i7) / height2;
                                        height2 = i7;
                                    }
                                }
                                Bitmap.Config config2 = this.A0B.getConfig();
                                if (this.A0T || config2 == null) {
                                    config2 = Bitmap.Config.ARGB_8888;
                                }
                                bitmap = Bitmap.createBitmap(width2, height2, config2);
                                A0e2.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        A0e2.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th2;
                                }
                            }
                        } catch (IOException e3) {
                            Log.e("cropimage/cannot_resample: ", e3);
                            setResult(0, new Intent().putExtra("io-error", true));
                            finish();
                            return;
                        } catch (OutOfMemoryError e4) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("cropimage/oom: ");
                            sb2.append(i6);
                            Log.e(sb2.toString(), e4);
                            Bitmap bitmap5 = this.A0B;
                            if (bitmap5 != null && !bitmap5.isRecycled()) {
                                this.A0B.recycle();
                                bitmap2 = null;
                                this.A0B = null;
                            } else {
                                bitmap2 = null;
                            }
                            if (bitmap != null && !bitmap.isRecycled()) {
                                bitmap.recycle();
                                bitmap = bitmap2;
                            }
                            A01.left >>= 1;
                            A01.right >>= 1;
                            A01.top >>= 1;
                            A01.bottom >>= 1;
                            i6 <<= 1;
                        }
                    }
                } else {
                    bitmap = null;
                }
                if (this.A0B == null) {
                    setResult(0, new Intent().putExtra("error-oom", true));
                    finish();
                    return;
                }
                int width3 = A01.width();
                int height3 = A01.height();
                int i8 = this.A03;
                if (i8 != 0 && (width3 > i8 || height3 > i8)) {
                    if (width3 > height3) {
                        height3 = (height3 * i8) / width3;
                        width3 = i8;
                    } else {
                        width3 = (width3 * i8) / height3;
                        height3 = i8;
                    }
                }
                if (bitmap == null) {
                    Bitmap.Config config3 = this.A0B.getConfig();
                    if (this.A0T || config3 == null) {
                        config3 = Bitmap.Config.ARGB_8888;
                    }
                    bitmap = Bitmap.createBitmap(width3, height3, config3);
                }
                Canvas canvas2 = new Canvas(bitmap);
                Rect rect = new Rect(0, 0, width3, height3);
                if (this.A0D != null && this.A0V) {
                    Matrix matrix2 = new Matrix();
                    matrix2.preTranslate((-(rect.left + rect.right)) >> 1, (-(rect.top + rect.bottom)) >> 1);
                    matrix2.postConcat(this.A0D);
                    matrix2.postRotate(this.A08);
                    matrix2.postTranslate((rect.left + rect.right) >> 1, (rect.top + rect.bottom) >> 1);
                    matrix2.mapRect(new RectF(rect));
                    canvas2.setMatrix(matrix2);
                }
                canvas2.drawBitmap(this.A0B, A01, rect, paint);
            }
            Bitmap bitmap6 = this.A0B;
            if (bitmap6 != null) {
                bitmap6.recycle();
            }
            if (bitmap == null) {
                setResult(0, new Intent().putExtra("io-error", true));
            }
            Rect A012 = this.A0M.A01();
            if (this.A09 > 1) {
                A0o(A012);
            }
            Uri uri = this.A0F;
            if (uri == null) {
                Intent intent = new Intent();
                intent.putExtra("rect", A012);
                intent.putExtra("rotate", this.A08);
                setResult(-1, intent);
                bitmap.recycle();
                finish();
                return;
            }
            new AsyncTask(this.A0J, this.A0I, this, uri, this.A0A, this.A04, bitmap, A012, this.A0V, this.A02, this.A08) { // from class: X.2tQ
                public final int A00;
                public final int A01;
                public final int A02;
                public final Bitmap.CompressFormat A03;
                public final Bitmap A04;
                public final Rect A05;
                public final Uri A06;
                public final C000400f A07;
                public final C02E A08;
                public final WeakReference A09;
                public final boolean A0A;

                {
                    this.A08 = r2;
                    this.A07 = r3;
                    this.A09 = new WeakReference(this);
                    this.A06 = uri;
                    this.A03 = r6;
                    this.A01 = r7;
                    this.A04 = bitmap;
                    this.A05 = A012;
                    this.A0A = r10;
                    this.A00 = r11;
                    this.A02 = r12;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:95:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x00d2  */
                /* JADX WARN: Type inference failed for: r1v2, types: [android.util.Pair] */
                /* JADX WARN: Type inference failed for: r1v3 */
                /* JADX WARN: Type inference failed for: r1v5, types: [android.util.Pair] */
                @Override // android.os.AsyncTask
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object doInBackground(java.lang.Object[] r13) {
                    /*
                        Method dump skipped, instructions count: 296
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.AsyncTaskC59792tQ.doInBackground(java.lang.Object[]):java.lang.Object");
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(Object obj) {
                    Pair pair = (Pair) obj;
                    super.onPostExecute(pair);
                    this.A04.recycle();
                    if (pair != null) {
                        ((Activity) this.A09.get()).setResult(((Number) pair.first).intValue(), (Intent) pair.second);
                    }
                    ((Activity) this.A09.get()).finish();
                }
            }.execute(new Void[0]);
        }
    }

    public void lambda$onCreate$1705$CropImage(View view) {
        this.A08 = (this.A08 + 270) % 360;
        RectF rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        this.A0L.getImageViewMatrix().mapRect(rectF);
        this.A0C.postRotate(-90.0f);
        CropImageView cropImageView = this.A0L;
        C59832tU c59832tU = new C59832tU(this.A0B);
        Matrix matrix = new Matrix();
        matrix.set(this.A0D);
        matrix.postConcat(this.A0C);
        c59832tU.A01 = matrix;
        cropImageView.A05(c59832tU, false);
        C2KQ c2kq = this.A0M;
        Matrix imageMatrix = this.A0L.getImageMatrix();
        if (c2kq != null) {
            c2kq.A03 = new Matrix(imageMatrix);
            c2kq.A04 = c2kq.A02();
            c2kq.A07.invalidate();
            RectF rectF2 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
            this.A0L.getImageViewMatrix().mapRect(rectF2);
            float min = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
            this.A0L.A06(this.A0M);
            AnimationSet animationSet = new AnimationSet(true);
            RotateAnimation rotateAnimation = new RotateAnimation(90.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(min, 1.0f, min, 1.0f, 1, 0.5f, 1, 0.5f);
            animationSet.addAnimation(rotateAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setDuration(300L);
            this.A0L.startAnimation(animationSet);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x03f2, code lost:
        if (r21.A01 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0412, code lost:
        if (r6 != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0605, code lost:
        if (r14[1] > 0.0f) goto L76;
     */
    @Override // X.C2Nk, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crop.CropImage.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        Log.i("crop/ondestroy");
        super.onDestroy();
        Bitmap bitmap = this.A0B;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.A0L.A04 = true;
            this.A0B.recycle();
            this.A0B = null;
        }
        this.A0R.AS1(new RunnableEBaseShape2S0100000_I0_2(this.A0K, 29));
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("rotate", this.A08);
        Rect A01 = this.A0M.A01();
        A0o(A01);
        bundle.putParcelable("initialRect", A01);
    }
}
