package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0jD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12310jD {
    public int A00;
    public int A01;
    public C12390jL A02;
    public ArrayList A03 = new ArrayList();

    public C12310jD(Context context, XmlPullParser xmlPullParser) {
        this.A00 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C12420jO.A0s);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.A01 = obtainStyledAttributes.getResourceId(index, this.A01);
            } else if (index == 1) {
                this.A00 = obtainStyledAttributes.getResourceId(index, this.A00);
                String resourceTypeName = context.getResources().getResourceTypeName(this.A00);
                context.getResources().getResourceName(this.A00);
                if ("layout".equals(resourceTypeName)) {
                    C12390jL c12390jL = new C12390jL();
                    this.A02 = c12390jL;
                    c12390jL.A06(context, this.A00);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
