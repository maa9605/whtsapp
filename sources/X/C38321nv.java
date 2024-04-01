package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.1nv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38321nv extends C1SJ implements InterfaceC11110hC {
    public int A00;
    public ListAdapter A01;
    public CharSequence A02;
    public final Rect A03;
    public final /* synthetic */ AppCompatSpinner A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38321nv(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.A04 = appCompatSpinner;
        this.A03 = new Rect();
        this.A0A = appCompatSpinner;
        this.A0G = true;
        this.A0D.setFocusable(true);
        this.A0B = new AdapterView.OnItemClickListener() { // from class: X.0h7
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                C38321nv c38321nv = C38321nv.this;
                AppCompatSpinner appCompatSpinner2 = c38321nv.A04;
                appCompatSpinner2.setSelection(i2);
                if (appCompatSpinner2.getOnItemClickListener() != null) {
                    appCompatSpinner2.performItemClick(view, i2, c38321nv.A01.getItemId(i2));
                }
                c38321nv.dismiss();
            }
        };
    }

    public void A02() {
        AppCompatSpinner appCompatSpinner;
        Rect rect;
        int i;
        Drawable A8T = A8T();
        int i2 = 0;
        if (A8T != null) {
            AppCompatSpinner appCompatSpinner2 = this.A04;
            appCompatSpinner = appCompatSpinner2;
            rect = appCompatSpinner2.A05;
            A8T.getPadding(rect);
            i2 = C0Ux.A01(appCompatSpinner2) ? rect.right : -rect.left;
        } else {
            appCompatSpinner = this.A04;
            rect = appCompatSpinner.A05;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i3 = appCompatSpinner.A00;
        if (i3 == -2) {
            int A00 = appCompatSpinner.A00((SpinnerAdapter) this.A01, A8T());
            int i4 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (A00 > i4) {
                A00 = i4;
            }
            A01(Math.max(A00, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            A01((width - paddingLeft) - paddingRight);
        } else {
            A01(i3);
        }
        if (C0Ux.A01(appCompatSpinner)) {
            i = (((width - paddingRight) - super.A04) - this.A00) + i2;
        } else {
            i = paddingLeft + this.A00 + i2;
        }
        super.A02 = i;
    }

    @Override // X.InterfaceC11110hC
    public CharSequence AAV() {
        return this.A02;
    }

    @Override // X.C1SJ, X.InterfaceC11110hC
    public void ASg(ListAdapter listAdapter) {
        super.ASg(listAdapter);
        this.A01 = listAdapter;
    }

    @Override // X.InterfaceC11110hC
    public void AT6(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC11110hC
    public void ATi(CharSequence charSequence) {
        this.A02 = charSequence;
    }

    @Override // X.InterfaceC11110hC
    public void AUb(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean AFo = AFo();
        A02();
        this.A0D.setInputMethodMode(2);
        super.AUa();
        C11150hH c11150hH = this.A0E;
        c11150hH.setChoiceMode(1);
        if (Build.VERSION.SDK_INT >= 17) {
            c11150hH.setTextDirection(i);
            c11150hH.setTextAlignment(i2);
        }
        AppCompatSpinner appCompatSpinner = this.A04;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C11150hH c11150hH2 = this.A0E;
        if (AFo() && c11150hH2 != null) {
            c11150hH2.A0B = false;
            c11150hH2.setSelection(selectedItemPosition);
            if (c11150hH2.getChoiceMode() != 0) {
                c11150hH2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (AFo || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0h8
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C38321nv c38321nv = C38321nv.this;
                AppCompatSpinner appCompatSpinner2 = c38321nv.A04;
                if (C0AT.A0g(appCompatSpinner2) && appCompatSpinner2.getGlobalVisibleRect(c38321nv.A03)) {
                    c38321nv.A02();
                    super/*X.1SJ*/.AUa();
                    return;
                }
                c38321nv.dismiss();
            }
        };
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        this.A0D.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0h9
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver2 = C38321nv.this.A04.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                }
            }
        });
    }
}
