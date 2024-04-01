package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.2Gi */
/* loaded from: classes2.dex */
public class C48702Gi {
    public int A02;
    public Bitmap A03;
    public Bitmap A04;
    public Bitmap A05;
    public Rect A06;
    public View A07;
    public AbstractC08940cM A08;
    public BottomSheetBehavior A09;
    public C48742Gm A0A;
    public C48732Gl A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final int A0J;
    public final int A0K;
    public final Activity A0L;
    public final View A0N;
    public final View A0O;
    public final CoordinatorLayout A0P;
    public final RecyclerView A0Q;
    public final C0JH A0R;
    public final C000500h A0S;
    public final C44011yN A0T;
    public final GestureDetector$OnDoubleTapListenerC48712Gj A0U;
    public final ExecutorC004702d A0V;
    public final Runnable A0W;
    public final String A0X;
    public final Handler A0M = new Handler(Looper.getMainLooper());
    public int A01 = 4;
    public float A00 = 0.28f;

    public C48702Gi(C011605s c011605s, InterfaceC002901k interfaceC002901k, C44011yN c44011yN, C002301c c002301c, C000500h c000500h, Activity activity, View view, Uri uri, GestureDetector$OnDoubleTapListenerC48712Gj gestureDetector$OnDoubleTapListenerC48712Gj, int i, C48742Gm c48742Gm) {
        this.A0L = activity;
        this.A0S = c000500h;
        this.A0O = view;
        this.A0U = gestureDetector$OnDoubleTapListenerC48712Gj;
        this.A02 = i;
        this.A0T = c44011yN;
        this.A0A = c48742Gm;
        this.A0R = c011605s.A03();
        this.A0V = new ExecutorC004702d(interfaceC002901k, false);
        this.A0P = (CoordinatorLayout) this.A0O.findViewById(R.id.filter_sheet_container);
        this.A0N = this.A0O.findViewById(R.id.filter_bottom_sheet);
        this.A0Q = (RecyclerView) this.A0O.findViewById(R.id.filter_selector);
        this.A07 = this.A0O.findViewById(R.id.media_content);
        StringBuilder sb = new StringBuilder();
        sb.append(uri.toString());
        sb.append("-filter");
        this.A0X = sb.toString();
        this.A0K = activity.getResources().getDimensionPixelSize(R.dimen.filter_thumb_width);
        this.A0J = activity.getResources().getDimensionPixelSize(R.dimen.filter_thumb_height);
        this.A0W = new RunnableEBaseShape0S0500000_I0(view, this, activity, c002301c, c44011yN, 3);
    }

    public static void A00(C48702Gi c48702Gi) {
        RecyclerView recyclerView = c48702Gi.A0Q;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
        View view = c48702Gi.A0O;
        int width = view.getWidth();
        int height = view.getHeight();
        int dimensionPixelSize = c48702Gi.A0L.getResources().getDimensionPixelSize(R.dimen.filter_selector_height);
        if (width < height) {
            c48702Gi.A00 = 0.28f;
        } else {
            c48702Gi.A00 = 0.5f;
        }
        Rect rect = c48702Gi.A06;
        marginLayoutParams.leftMargin = rect.left;
        marginLayoutParams.rightMargin = rect.right;
        marginLayoutParams.topMargin = rect.top;
        marginLayoutParams.bottomMargin = rect.bottom;
        recyclerView.setLayoutParams(marginLayoutParams);
        recyclerView.A0i = true;
        c48702Gi.A09.A0N((height - dimensionPixelSize) - c48702Gi.A06.bottom);
        float f = width / 2.0f;
        float height2 = (height - recyclerView.getHeight()) / 2.0f;
        c48702Gi.A07.setPivotX(f);
        c48702Gi.A07.setPivotY(height2);
        C48742Gm c48742Gm = c48702Gi.A0A;
        c48742Gm.A0G.setPivotX(f);
        c48742Gm.A0G.setPivotY(height2);
        if (c48702Gi.A09.A0B == 3) {
            float f2 = 1.0f - c48702Gi.A00;
            c48702Gi.A07.setScaleX(f2);
            c48702Gi.A07.setScaleY(f2);
            C48742Gm c48742Gm2 = c48702Gi.A0A;
            c48742Gm2.A0G.setScaleX(f2);
            c48742Gm2.A0G.setScaleY(f2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0010, code lost:
        if (A08() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01() {
        /*
            r3 = this;
            android.view.View r2 = r3.A0N
            if (r2 != 0) goto L5
            return
        L5:
            boolean r0 = r3.A07()
            if (r0 != 0) goto L12
            boolean r1 = r3.A08()
            r0 = 0
            if (r1 == 0) goto L13
        L12:
            r0 = 1
        L13:
            r1 = 0
            if (r0 == 0) goto L20
            boolean r0 = r3.A08()
            if (r0 != 0) goto L1f
            r2.setVisibility(r1)
        L1f:
            return
        L20:
            r0 = 1
            r3.A0F = r0
            r3.A0D = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48702Gi.A01():void");
    }

    public void A02() {
        if (this.A05 != null) {
            C0JH c0jh = this.A0R;
            String str = this.A0X;
            Bitmap bitmap = (Bitmap) c0jh.A01(str);
            this.A04 = bitmap;
            if (bitmap == null) {
                int i = this.A02;
                if (i == 0) {
                    this.A04 = this.A05;
                    c0jh.A04(str);
                    return;
                }
                Bitmap A01 = FilterUtils.A01(this.A05, i, true, this.A0T);
                this.A04 = A01;
                if (A01 == null) {
                    this.A04 = this.A05;
                    this.A02 = 0;
                    Log.w("FilterSelectorController/updateFilteredMediaBitmap/filter failed");
                    return;
                }
                c0jh.A05(str, A01);
            }
        }
    }

    public final void A03() {
        C48732Gl c48732Gl = this.A0B;
        if (c48732Gl == null) {
            return;
        }
        int i = 0;
        while (true) {
            C48702Gi c48702Gi = c48732Gl.A0A;
            if (i < c48702Gi.A0Q.getChildCount()) {
                RecyclerView recyclerView = c48732Gl.A0A.A0Q;
                View$OnClickListenerC68053Hw view$OnClickListenerC68053Hw = (View$OnClickListenerC68053Hw) recyclerView.A0E(recyclerView.getChildAt(i));
                if (view$OnClickListenerC68053Hw != null) {
                    ImageView imageView = view$OnClickListenerC68053Hw.A02;
                    imageView.setBackgroundResource(0);
                    imageView.setImageDrawable(null);
                }
                i++;
            } else {
                new C0HS(c48732Gl.A01) { // from class: X.3Hu
                    public Bitmap[] A00;

                    {
                        this.A00 = r1;
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        int i2 = 0;
                        while (true) {
                            Bitmap[] bitmapArr = this.A00;
                            if (i2 >= bitmapArr.length) {
                                return null;
                            }
                            if (bitmapArr[i2] != null) {
                                bitmapArr[i2].recycle();
                                this.A00[i2] = null;
                            }
                            i2++;
                        }
                    }
                }.A02.executeOnExecutor(c48702Gi.A0V, new Void[0]);
                return;
            }
        }
    }

    public final void A04() {
        if (this.A05 == null || this.A0C) {
            return;
        }
        new C0HS() { // from class: X.3Hr
            {
                C48702Gi.this = this;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                try {
                    C48702Gi c48702Gi = C48702Gi.this;
                    Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(c48702Gi.A05, c48702Gi.A0K, c48702Gi.A0J);
                    if (extractThumbnail != null) {
                        c48702Gi.A03 = extractThumbnail;
                        C48732Gl c48732Gl = c48702Gi.A0B;
                        if (c48732Gl != null) {
                            Arrays.fill(c48732Gl.A03, true);
                        }
                    }
                    return null;
                } catch (OutOfMemoryError e) {
                    Log.e("FilterThumbnailAdapter/updateBaseThumbnail/OutOfMemoryError", e);
                    return null;
                }
            }
        }.A02.executeOnExecutor(this.A0V, new Void[0]);
        this.A0C = true;
    }

    public void A05(final int i, final Runnable runnable, final Runnable runnable2) {
        if (this.A05 != null) {
            C0JH c0jh = this.A0R;
            String str = this.A0X;
            final Bitmap bitmap = (Bitmap) c0jh.A01(str);
            if (i != this.A02 || i == 0) {
                c0jh.A04(str);
            }
            if (i != 0) {
                new C0HS() { // from class: X.3Hs
                    {
                        C48702Gi.this = this;
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        C48702Gi c48702Gi = C48702Gi.this;
                        Bitmap bitmap2 = c48702Gi.A05;
                        if (bitmap2 != null) {
                            Bitmap bitmap3 = bitmap;
                            if (bitmap3 != null && bitmap3 != bitmap2 && bitmap3.getHeight() == c48702Gi.A05.getHeight() && bitmap3.getWidth() == c48702Gi.A05.getWidth()) {
                                if (FilterUtils.A02(c48702Gi.A05, bitmap3, i, c48702Gi.A0T)) {
                                    return bitmap3;
                                }
                            } else {
                                return FilterUtils.A01(c48702Gi.A05, i, true, c48702Gi.A0T);
                            }
                        }
                        return null;
                    }

                    @Override // X.C0HS
                    public void A09(Object obj) {
                        Bitmap bitmap2 = (Bitmap) obj;
                        if (bitmap2 != null) {
                            C48702Gi c48702Gi = C48702Gi.this;
                            c48702Gi.A04 = bitmap2;
                            Runnable runnable3 = runnable;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                            c48702Gi.A02 = i;
                            ((C48722Gk) c48702Gi.A0U).A02();
                            c48702Gi.A0R.A05(c48702Gi.A0X, c48702Gi.A04);
                            return;
                        }
                        Bitmap bitmap3 = bitmap;
                        if (bitmap3 != null) {
                            C48702Gi c48702Gi2 = C48702Gi.this;
                            c48702Gi2.A04 = bitmap3;
                            ((C48722Gk) c48702Gi2.A0U).A02();
                            c48702Gi2.A0R.A05(c48702Gi2.A0X, c48702Gi2.A04);
                            Runnable runnable4 = runnable2;
                            if (runnable4 == null) {
                                return;
                            }
                            runnable4.run();
                            return;
                        }
                        Runnable runnable5 = runnable2;
                        if (runnable5 == null) {
                            return;
                        }
                        runnable5.run();
                    }
                }.A02.executeOnExecutor(this.A0V, new Void[0]);
                return;
            }
            this.A04 = this.A05;
            if (runnable != null) {
                runnable.run();
            }
            this.A02 = 0;
            ((C48722Gk) this.A0U).A02();
            return;
        }
        Log.e("FilterSelectorController/startUpdateFilteredMediaBitmapTask/mediaBitmap is null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0010, code lost:
        if (A08() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(boolean r4) {
        /*
            r3 = this;
            android.view.View r2 = r3.A0N
            if (r2 != 0) goto L5
            return
        L5:
            boolean r0 = r3.A07()
            if (r0 != 0) goto L12
            boolean r1 = r3.A08()
            r0 = 0
            if (r1 == 0) goto L13
        L12:
            r0 = 1
        L13:
            if (r0 == 0) goto L1a
            r0 = 4
            r2.setVisibility(r0)
            return
        L1a:
            r0 = 0
            r3.A0F = r0
            r0 = 1
            r3.A0D = r0
            r3.A0E = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48702Gi.A06(boolean):void");
    }

    public boolean A07() {
        BottomSheetBehavior bottomSheetBehavior;
        return this.A0N == null || (bottomSheetBehavior = this.A09) == null || bottomSheetBehavior.A0B == 4;
    }

    public boolean A08() {
        BottomSheetBehavior bottomSheetBehavior;
        return (this.A0N == null || (bottomSheetBehavior = this.A09) == null || bottomSheetBehavior.A0B != 3) ? false : true;
    }

    public boolean A09() {
        View view = this.A0N;
        if (view == null || A07() || this.A0I) {
            return false;
        }
        this.A08.A01(view, 1);
        this.A09.A0O(4);
        this.A0I = true;
        return true;
    }
}
