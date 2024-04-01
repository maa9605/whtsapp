package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;

/* renamed from: X.0gJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10580gJ {
    public int A00;
    public int A01;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Drawable A09;
    public Handler A0A;
    public Message A0B;
    public Message A0C;
    public Message A0D;
    public View A0E;
    public View A0F;
    public Button A0G;
    public Button A0H;
    public Button A0I;
    public ImageView A0J;
    public ListAdapter A0K;
    public ListView A0L;
    public TextView A0M;
    public TextView A0N;
    public NestedScrollView A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public CharSequence A0S;
    public CharSequence A0T;
    public boolean A0U;
    public final int A0V;
    public final Context A0W;
    public final Window A0Y;
    public final AnonymousClass090 A0Z;
    public int A03 = 0;
    public int A02 = -1;
    public final View.OnClickListener A0X = new View.OnClickListener() { // from class: X.0g9
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message obtain;
            Message message2;
            Message message3;
            C10580gJ c10580gJ = C10580gJ.this;
            if (view == c10580gJ.A0I && (message3 = c10580gJ.A0D) != null) {
                obtain = Message.obtain(message3);
            } else if (view == c10580gJ.A0G && (message2 = c10580gJ.A0B) != null) {
                obtain = Message.obtain(message2);
            } else {
                if (view == c10580gJ.A0H && (message = c10580gJ.A0C) != null) {
                    obtain = Message.obtain(message);
                }
                c10580gJ.A0A.obtainMessage(1, c10580gJ.A0Z).sendToTarget();
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            c10580gJ.A0A.obtainMessage(1, c10580gJ.A0Z).sendToTarget();
        }
    };

    public C10580gJ(Context context, final AnonymousClass090 anonymousClass090, Window window) {
        this.A0W = context;
        this.A0Z = anonymousClass090;
        this.A0Y = window;
        this.A0A = new Handler(anonymousClass090) { // from class: X.0gG
            public WeakReference A00;

            {
                this.A00 = new WeakReference(anonymousClass090);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.A00.get(), i);
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0UY.A06, R.attr.alertDialogStyle, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, 0);
        this.A01 = obtainStyledAttributes.getResourceId(2, 0);
        this.A05 = obtainStyledAttributes.getResourceId(4, 0);
        this.A06 = obtainStyledAttributes.getResourceId(5, 0);
        this.A07 = obtainStyledAttributes.getResourceId(7, 0);
        this.A04 = obtainStyledAttributes.getResourceId(3, 0);
        this.A0U = obtainStyledAttributes.getBoolean(6, true);
        this.A0V = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        anonymousClass090.A00().A0R(1);
    }

    public static final ViewGroup A00(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public static void A01(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static final void A02(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static boolean A03(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (A03(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void A04(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.A0A.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.A0Q = charSequence;
            this.A0C = obtainMessage;
        } else if (i == -2) {
            this.A0P = charSequence;
            this.A0B = obtainMessage;
        } else if (i == -1) {
            this.A0R = charSequence;
            this.A0D = obtainMessage;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
