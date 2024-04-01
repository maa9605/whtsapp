package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Mb */
/* loaded from: classes.dex */
public class C04850Mb extends EditText implements InterfaceC02710Co {
    public final C07980aP A00;
    public final C08000aR A01;
    public final C07990aQ A02;

    public C04850Mb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public C04850Mb(Context context, AttributeSet attributeSet, int i) {
        super(C07970aO.A00(context), attributeSet, R.attr.editTextStyle);
        C07980aP c07980aP = new C07980aP(this);
        this.A00 = c07980aP;
        c07980aP.A08(attributeSet, R.attr.editTextStyle);
        C07990aQ c07990aQ = new C07990aQ(this);
        this.A02 = c07990aQ;
        c07990aQ.A07(attributeSet, R.attr.editTextStyle);
        this.A02.A01();
        this.A01 = new C08000aR(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A02();
        }
        C07990aQ c07990aQ = this.A02;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // X.InterfaceC02710Co
    public ColorStateList getSupportBackgroundTintList() {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            return c07980aP.A00();
        }
        return null;
    }

    @Override // X.InterfaceC02710Co
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            return c07980aP.A01();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C08000aR c08000aR;
        if (Build.VERSION.SDK_INT < 28 && (c08000aR = this.A01) != null) {
            TextClassifier textClassifier = c08000aR.A00;
            if (textClassifier == null) {
                TextClassificationManager textClassificationManager = (TextClassificationManager) c08000aR.A01.getContext().getSystemService(TextClassificationManager.class);
                if (textClassificationManager != null) {
                    return textClassificationManager.getTextClassifier();
                }
                return TextClassifier.NO_OP;
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C07O.A0f(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A04(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C07O.A0K(this, callback));
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A06(colorStateList);
        }
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A07(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C07990aQ c07990aQ = this.A02;
        if (c07990aQ != null) {
            c07990aQ.A04(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C08000aR c08000aR;
        if (Build.VERSION.SDK_INT < 28 && (c08000aR = this.A01) != null) {
            c08000aR.A00 = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}
