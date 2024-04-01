package X;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;

/* renamed from: X.1dd */
/* loaded from: classes.dex */
public class DialogC32191dd extends AnonymousClass090 {
    public AbstractC08940cM A00;
    public BottomSheetBehavior A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC32191dd(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r3 = 1
            if (r6 != 0) goto L17
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r0 = 2130968665(0x7f040059, float:1.754599E38)
            boolean r0 = r1.resolveAttribute(r0, r2, r3)
            if (r0 == 0) goto L2d
            int r6 = r2.resourceId
        L17:
            r4.<init>(r5, r6)
            r4.A02 = r3
            r4.A03 = r3
            X.1eP r0 = new X.1eP
            r0.<init>()
            r4.A00 = r0
            X.01x r0 = r4.A00()
            r0.A0R(r3)
            return
        L2d:
            r6 = 2131952269(0x7f13028d, float:1.9540976E38)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC32191dd.<init>(android.content.Context, int):void");
    }

    public final View A02(int i, View view, ViewGroup.LayoutParams layoutParams) {
        View inflate = View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.design_bottom_sheet);
        BottomSheetBehavior A00 = BottomSheetBehavior.A00(viewGroup2);
        this.A01 = A00;
        A00.A0E = this.A00;
        A00.A0J = this.A02;
        if (layoutParams == null) {
            viewGroup2.addView(view);
        } else {
            viewGroup2.addView(view, layoutParams);
        }
        viewGroup.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: X.1Ah
            {
                DialogC32191dd.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                DialogC32191dd dialogC32191dd = DialogC32191dd.this;
                if (dialogC32191dd.A02 && dialogC32191dd.isShowing()) {
                    if (!dialogC32191dd.A04) {
                        TypedArray obtainStyledAttributes = dialogC32191dd.getContext().obtainStyledAttributes(new int[]{16843611});
                        dialogC32191dd.A03 = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        dialogC32191dd.A04 = true;
                    }
                    if (dialogC32191dd.A03) {
                        dialogC32191dd.cancel();
                    }
                }
            }
        });
        C0AT.A0c(viewGroup2, new C0AS() { // from class: X.1eO
            {
                DialogC32191dd.this = this;
            }

            @Override // X.C0AS
            public void A04(View view2, C08420bS c08420bS) {
                View.AccessibilityDelegate accessibilityDelegate = this.A01;
                AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                if (DialogC32191dd.this.A02) {
                    accessibilityNodeInfo.addAction(1048576);
                    c08420bS.A0B(true);
                    return;
                }
                c08420bS.A0B(false);
            }

            @Override // X.C0AS
            public boolean A05(View view2, int i2, Bundle bundle) {
                if (i2 == 1048576) {
                    DialogC32191dd dialogC32191dd = DialogC32191dd.this;
                    if (dialogC32191dd.A02) {
                        dialogC32191dd.cancel();
                        return true;
                    }
                }
                return super.A05(view2, i2, bundle);
            }
        });
        viewGroup2.setOnTouchListener(new View.OnTouchListener() { // from class: X.1Ai
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        return inflate;
    }

    @Override // X.AnonymousClass090, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0B != 5) {
            return;
        }
        bottomSheetBehavior.A0O(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.A02 != z) {
            this.A02 = z;
            BottomSheetBehavior bottomSheetBehavior = this.A01;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0J = z;
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.A02) {
            this.A02 = true;
        }
        this.A03 = z;
        this.A04 = true;
    }

    @Override // X.AnonymousClass090, android.app.Dialog
    public void setContentView(int i) {
        A00().A0L(A02(i, null, null));
    }

    @Override // X.AnonymousClass090, android.app.Dialog
    public void setContentView(View view) {
        A00().A0L(A02(0, view, null));
    }

    @Override // X.AnonymousClass090, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00().A0L(A02(0, view, layoutParams));
    }
}
