package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0L7 */
/* loaded from: classes.dex */
public class C0L7 {
    public static volatile C0L7 A02;
    public final C011805u A00;
    public final C001200o A01;

    public C0L7(C001200o c001200o, C011805u c011805u) {
        this.A01 = c001200o;
        this.A00 = c011805u;
    }

    public static int A00(AbstractC005302j abstractC005302j) {
        if (C003101m.A0Y(abstractC005302j)) {
            return R.drawable.avatar_server_psa;
        }
        if (C003101m.A0Z(abstractC005302j)) {
            return R.drawable.avatar_status;
        }
        if (C003101m.A0P(abstractC005302j)) {
            return R.drawable.avatar_broadcast;
        }
        if (C003101m.A0U(abstractC005302j)) {
            return R.drawable.avatar_group;
        }
        return R.drawable.avatar_contact;
    }

    public static Bitmap A01(Context context, int i, int i2, float f) {
        Drawable drawable = context.getResources().getDrawable(i);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        int A00 = C02160Ac.A00(context, R.color.primary_surface);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i2, i2);
        if (drawable instanceof BitmapDrawable) {
            Paint paint = new Paint();
            float f2 = i2;
            RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setFilterBitmap(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(A00);
            if (f >= 0.0f) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(((BitmapDrawable) drawable).getBitmap(), (Rect) null, rectF, paint);
            return createBitmap;
        }
        drawable.draw(canvas);
        return createBitmap;
    }

    public static C0L7 A02() {
        if (A02 == null) {
            synchronized (C0L7.class) {
                if (A02 == null) {
                    A02 = new C0L7(C001200o.A01, C011805u.A02);
                }
            }
        }
        return A02;
    }

    public int A03(C06C c06c) {
        return A00((AbstractC005302j) c06c.A03(AbstractC005302j.class));
    }

    public Bitmap A04(C06C c06c, int i, float f) {
        Bitmap decodeResource;
        if (Build.VERSION.SDK_INT >= 21) {
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int A03 = A03(c06c);
            if (i2 >= 0) {
                decodeResource = A01(this.A01.A00, A03, i, f);
            } else {
                decodeResource = this.A00.A00(this.A01.A00, A03);
            }
        } else {
            decodeResource = BitmapFactory.decodeResource(this.A01.A00.getResources(), A03(c06c));
        }
        return i != 0 ? Bitmap.createScaledBitmap(decodeResource, i, i, true) : decodeResource;
    }

    public void A05(ImageView imageView, int i) {
        imageView.setImageBitmap(this.A00.A00(imageView.getContext(), i));
    }

    public void A06(ImageView imageView, C06C c06c) {
        A05(imageView, A00((AbstractC005302j) c06c.A03(AbstractC005302j.class)));
    }
}
