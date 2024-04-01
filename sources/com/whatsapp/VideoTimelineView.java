package com.whatsapp;

import X.AnonymousClass029;
import X.C08540bf;
import X.C0HS;
import X.C0SB;
import X.C1LK;
import X.C1LL;
import X.C67683Gl;
import X.C67693Gm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.VideoTimelineView;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class VideoTimelineView extends C0SB {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public C1LK A0H;
    public C1LL A0I;
    public C0HS A0J;
    public File A0K;
    public ArrayList A0L;
    public final Paint A0M;
    public final Rect A0N;
    public final RectF A0O;

    public VideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0M = new Paint(1);
        this.A0O = new RectF();
        this.A0N = new Rect();
        this.A00 = 1.0f;
        this.A07 = -1;
        this.A05 = 12.0f;
        this.A0B = -1;
        this.A06 = 12.0f;
        this.A0C = -1;
        this.A08 = 855638016;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A2k);
            this.A00 = obtainStyledAttributes.getDimension(1, 1.0f);
            this.A07 = obtainStyledAttributes.getInteger(0, -1);
            this.A05 = obtainStyledAttributes.getDimension(5, 12.0f);
            this.A0B = obtainStyledAttributes.getInteger(3, -1);
            this.A06 = obtainStyledAttributes.getDimension(6, 12.0f);
            this.A0C = obtainStyledAttributes.getInteger(4, -1);
            this.A08 = obtainStyledAttributes.getInteger(2, 855638016);
            obtainStyledAttributes.recycle();
        }
    }

    public final int A00(long j) {
        return Math.min(getPaddingLeft() + getTimelineWidth(), Math.max(getPaddingLeft(), (int) (((getTimelineWidth() * j) / this.A0D) + getPaddingLeft())));
    }

    public final long A01(float f) {
        return Math.min(this.A0D, Math.max(((f - getPaddingLeft()) * ((float) this.A0D)) / getTimelineWidth(), 0L));
    }

    public final void A02(float f) {
        int i;
        if (this.A01 == f || (i = this.A0A) == 0) {
            return;
        }
        float f2 = f - this.A02;
        long j = 0;
        if (i == 1) {
            long A01 = A01(this.A03 + f2);
            long j2 = this.A0G;
            long min = Math.min(A01, j2);
            this.A0F = min;
            long j3 = this.A0E;
            if (j2 - min > j3) {
                this.A0G = min + j3;
            }
        } else if (i == 2) {
            long A012 = A01(this.A04 + f2);
            long j4 = this.A0F;
            long max = Math.max(A012, j4);
            this.A0G = max;
            long j5 = this.A0E;
            if (max - j4 > j5) {
                this.A0F = max - j5;
            }
        } else if (i == 3) {
            long j6 = this.A0G - this.A0F;
            long A013 = A01(this.A03 + f2);
            this.A0F = A013;
            if (A013 != 0) {
                long A014 = A01(this.A04 + f2);
                this.A0G = A014;
                if (A014 == this.A0D) {
                    this.A0F = A014 - j6;
                }
            } else {
                this.A0G = A013 + j6;
            }
        }
        this.A01 = f;
        invalidate();
        C1LK c1lk = this.A0H;
        if (c1lk != null) {
            long j7 = this.A0F;
            long j8 = this.A0G;
            C67683Gl c67683Gl = (C67683Gl) c1lk;
            if (c67683Gl.A00.A0T.A0C()) {
                c67683Gl.A00.A16();
            }
            VideoComposerFragment videoComposerFragment = c67683Gl.A00;
            videoComposerFragment.A03 = j7;
            videoComposerFragment.A04 = j8;
            if (j7 - 200 <= 0 && j8 + 200 >= videoComposerFragment.A0R.A04) {
                j8 = 0;
            } else if (j8 - j7 < 1000) {
                j8 = Math.min(j7 + 1000, videoComposerFragment.A0R.A04);
                j = Math.max(0L, j8 - 1000);
            } else {
                j = j7;
            }
            videoComposerFragment.A0y().AU5(((MediaComposerFragment) videoComposerFragment).A00, j, j8);
            videoComposerFragment.A0T.A0A((int) j7);
            videoComposerFragment.A12();
            TextView textView = videoComposerFragment.A0F;
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass029.A0g(videoComposerFragment.A0M, videoComposerFragment.A03 / 1000));
            sb.append(" - ");
            sb.append(AnonymousClass029.A0g(videoComposerFragment.A0M, videoComposerFragment.A04 / 1000));
            textView.setText(sb.toString());
            videoComposerFragment.A17();
        }
    }

    private int getTimelineHeight() {
        return Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom());
    }

    private int getTimelineWidth() {
        return Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0HS c0hs = this.A0J;
        if (c0hs != null) {
            c0hs.A05(true);
            this.A0J = null;
        }
        this.A0L = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        VideoComposerFragment videoComposerFragment;
        super.onDraw(canvas);
        if (this.A0K == null) {
            if (isInEditMode()) {
                Paint paint = this.A0M;
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(this.A08);
                RectF rectF = this.A0O;
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                canvas.drawRect(rectF, paint);
                return;
            }
            return;
        }
        int timelineWidth = getTimelineWidth();
        int timelineHeight = getTimelineHeight();
        if (timelineHeight <= 0 || timelineWidth <= 0) {
            return;
        }
        if (this.A09 != timelineWidth) {
            this.A09 = timelineWidth;
            this.A0L = null;
            C0HS c0hs = this.A0J;
            if (c0hs != null) {
                c0hs.A05(true);
                this.A0J = null;
            }
        }
        if (this.A0L == null) {
            if (this.A0J == null) {
                final int i3 = timelineWidth / timelineHeight;
                this.A0L = new ArrayList(i3);
                final File file = this.A0K;
                final float f3 = timelineWidth / i3;
                final float f4 = timelineHeight;
                C0HS c0hs2 = new C0HS(this, file, i3, f3, f4) { // from class: X.1jU
                    public long A00;
                    public final float A01;
                    public final float A02;
                    public final int A03;
                    public final File A04;
                    public final WeakReference A05;

                    {
                        this.A05 = new WeakReference(this);
                        this.A04 = file;
                        this.A03 = i3;
                        this.A02 = f3;
                        this.A01 = f4;
                    }

                    @Override // X.C0HS
                    public void A03(Object[] objArr) {
                        VideoTimelineView videoTimelineView = (VideoTimelineView) this.A05.get();
                        if (videoTimelineView != null) {
                            ArrayList arrayList = videoTimelineView.A0L;
                            if (arrayList != null) {
                                Collections.addAll(arrayList, objArr);
                            }
                            if (System.currentTimeMillis() > this.A00 + 500) {
                                this.A00 = System.currentTimeMillis();
                                videoTimelineView.invalidate();
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #2 {all -> 0x00a3, blocks: (B:3:0x0005, B:4:0x0016, B:5:0x0033, B:7:0x0037, B:9:0x003d, B:10:0x0045, B:12:0x004b, B:14:0x0058, B:16:0x005d, B:18:0x0069, B:19:0x0075, B:24:0x008f, B:25:0x0092, B:20:0x007e), top: B:37:0x0005 }] */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x0092 A[SYNTHETIC] */
                    @Override // X.C0HS
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public java.lang.Object A07(java.lang.Object[] r19) {
                        /*
                            r18 = this;
                            X.1sw r11 = new X.1sw
                            r11.<init>()
                            r13 = r18
                            java.io.File r0 = r13.A04     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> La3
                            r11.A00(r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> La3
                            r0 = 9
                            java.lang.String r0 = r11.extractMetadata(r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> La3
                            long r16 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> La3
                            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La3
                            r13.A00 = r0     // Catch: java.lang.Throwable -> La3
                            float r12 = r13.A02     // Catch: java.lang.Throwable -> La3
                            float r10 = r13.A01     // Catch: java.lang.Throwable -> La3
                            r0 = 0
                            android.graphics.RectF r9 = new android.graphics.RectF     // Catch: java.lang.Throwable -> La3
                            r9.<init>(r0, r0, r12, r10)     // Catch: java.lang.Throwable -> La3
                            android.graphics.Rect r8 = new android.graphics.Rect     // Catch: java.lang.Throwable -> La3
                            r8.<init>()     // Catch: java.lang.Throwable -> La3
                            r7 = 1
                            android.graphics.Paint r6 = new android.graphics.Paint     // Catch: java.lang.Throwable -> La3
                            r6.<init>(r7)     // Catch: java.lang.Throwable -> La3
                            r5 = 0
                            r4 = 0
                        L33:
                            int r14 = r13.A03     // Catch: java.lang.Throwable -> La3
                            if (r4 >= r14) goto L9e
                            boolean r0 = r13.A04()     // Catch: java.lang.Throwable -> La3
                            if (r0 != 0) goto L9e
                            r2 = 1000(0x3e8, double:4.94E-321)
                            long r2 = r2 * r16
                            long r0 = (long) r4     // Catch: java.lang.Throwable -> La3
                            long r2 = r2 * r0
                            long r0 = (long) r14     // Catch: java.lang.Throwable -> La3
                            long r2 = r2 / r0
                            android.graphics.Bitmap r1 = r11.getFrameAtTime(r2)     // Catch: java.lang.Throwable -> L8b java.lang.Throwable -> La3
                            if (r1 == 0) goto L8c
                            int r14 = r1.getWidth()     // Catch: java.lang.Throwable -> La3
                            int r3 = r1.getHeight()     // Catch: java.lang.Throwable -> La3
                            float r0 = (float) r14     // Catch: java.lang.Throwable -> La3
                            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
                            if (r0 <= 0) goto L8c
                            float r0 = (float) r3     // Catch: java.lang.Throwable -> La3
                            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
                            if (r0 <= 0) goto L8c
                            int r15 = (int) r12     // Catch: java.lang.Throwable -> La3
                            int r2 = (int) r10     // Catch: java.lang.Throwable -> La3
                            android.graphics.Bitmap$Config r0 = r1.getConfig()     // Catch: java.lang.Throwable -> La3
                            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r15, r2, r0)     // Catch: java.lang.Throwable -> La3
                            if (r14 <= r3) goto L7e
                            r8.top = r5     // Catch: java.lang.Throwable -> La3
                            r8.bottom = r3     // Catch: java.lang.Throwable -> La3
                            int r14 = r14 - r3
                            int r0 = r14 / 2
                            r8.left = r0     // Catch: java.lang.Throwable -> La3
                            int r0 = r0 + r3
                            r8.right = r0     // Catch: java.lang.Throwable -> La3
                        L75:
                            android.graphics.Canvas r0 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> La3
                            r0.<init>(r2)     // Catch: java.lang.Throwable -> La3
                            r0.drawBitmap(r1, r8, r9, r6)     // Catch: java.lang.Throwable -> La3
                            goto L8d
                        L7e:
                            r8.left = r5     // Catch: java.lang.Throwable -> La3
                            r8.right = r14     // Catch: java.lang.Throwable -> La3
                            int r3 = r3 - r14
                            int r0 = r3 / 2
                            r8.top = r0     // Catch: java.lang.Throwable -> La3
                            int r0 = r0 + r14
                            r8.bottom = r0     // Catch: java.lang.Throwable -> La3
                            goto L75
                        L8b:
                            r1 = 0
                        L8c:
                            r2 = r1
                        L8d:
                            if (r2 == r1) goto L92
                            r1.recycle()     // Catch: java.lang.Throwable -> La3
                        L92:
                            android.graphics.Bitmap[] r1 = new android.graphics.Bitmap[r7]     // Catch: java.lang.Throwable -> La3
                            r1[r5] = r2     // Catch: java.lang.Throwable -> La3
                            X.2C1 r0 = r13.A02     // Catch: java.lang.Throwable -> La3
                            r0.A00(r1)     // Catch: java.lang.Throwable -> La3
                            int r4 = r4 + 1
                            goto L33
                        L9e:
                            r11.close()
                            r0 = 0
                            return r0
                        La3:
                            r0 = move-exception
                            throw r0     // Catch: java.lang.Throwable -> La5
                        La5:
                            r0 = move-exception
                            r11.close()     // Catch: java.lang.Throwable -> La9
                        La9:
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C35651jU.A07(java.lang.Object[]):java.lang.Object");
                    }

                    @Override // X.C0HS
                    public void A09(Object obj) {
                        View view = (View) this.A05.get();
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                };
                this.A0J = c0hs2;
                c0hs2.A02.execute(new Void[0]);
            }
        } else {
            float f5 = timelineWidth / (timelineWidth / timelineHeight);
            RectF rectF2 = this.A0O;
            rectF2.top = getPaddingTop();
            rectF2.bottom = getPaddingTop() + timelineHeight;
            for (int i4 = 0; i4 < this.A0L.size(); i4++) {
                float paddingLeft = (i4 * f5) + getPaddingLeft();
                rectF2.left = paddingLeft;
                rectF2.right = paddingLeft + f5;
                Bitmap bitmap = (Bitmap) this.A0L.get(i4);
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.A0N;
                    if (width > height) {
                        rect.top = 0;
                        rect.bottom = height;
                        int i5 = (width - height) / 2;
                        rect.left = i5;
                        rect.right = i5 + height;
                    } else {
                        rect.left = 0;
                        rect.right = width;
                        int i6 = (height - width) / 2;
                        rect.top = i6;
                        rect.bottom = i6 + width;
                    }
                    canvas.drawBitmap(bitmap, rect, rectF2, this.A0M);
                }
            }
        }
        if (this.A0H != null) {
            float A00 = A00(this.A0F);
            float A002 = A00(this.A0G);
            Paint paint2 = this.A0M;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(this.A08);
            RectF rectF3 = this.A0O;
            rectF3.set(getPaddingLeft(), getPaddingTop(), A00, getHeight() - getPaddingBottom());
            canvas.drawRect(rectF3, paint2);
            rectF3.set(A002, getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.drawRect(rectF3, paint2);
            C1LL c1ll = this.A0I;
            if (c1ll != null) {
                C67693Gm c67693Gm = (C67693Gm) c1ll;
                if (c67693Gm.A00.A0T.A0C()) {
                    c67693Gm.A00.A02 = videoComposerFragment.A0T.A02();
                }
                long j = c67693Gm.A00.A02;
                if (j >= 0 && j >= this.A0F && j <= this.A0G) {
                    paint2.setColor(this.A07);
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(this.A00 / 2.0f);
                    float A003 = A00(j);
                    canvas.drawLine(A003, getPaddingTop(), A003, getHeight() - getPaddingBottom(), paint2);
                }
                if (((C67693Gm) this.A0I).A00.A0T.A0C()) {
                    invalidate();
                }
            }
            paint2.setColor(this.A07);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(this.A00);
            rectF3.set(A00 - 1.0f, getPaddingTop(), 1.0f + A002, getHeight() - getPaddingBottom());
            canvas.drawRect(rectF3, paint2);
            paint2.setStyle(Paint.Style.FILL);
            if (this.A0A == 1) {
                i = this.A0C;
            } else {
                i = this.A0B;
            }
            paint2.setColor(i);
            int i7 = timelineHeight / 2;
            float paddingTop = getPaddingTop() + i7;
            if (this.A0A == 1) {
                f = this.A06;
            } else {
                f = this.A05;
            }
            canvas.drawCircle(A00, paddingTop, f, paint2);
            if (this.A0A == 2) {
                i2 = this.A0C;
            } else {
                i2 = this.A0B;
            }
            paint2.setColor(i2);
            float paddingTop2 = getPaddingTop() + i7;
            if (this.A0A == 2) {
                f2 = this.A06;
            } else {
                f2 = this.A05;
            }
            canvas.drawCircle(A002, paddingTop2, f2, paint2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r1 != 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
        if ((r9 / getWidth()) <= 0.5f) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoTimelineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMaxTrim(long j) {
        this.A0E = j;
    }

    public void setTrimListener(C1LK c1lk) {
        this.A0H = c1lk;
    }

    public void setVideoPlayback(C1LL c1ll) {
        this.A0I = c1ll;
    }
}
