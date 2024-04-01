package com.facebook.rendercore;

import X.AbstractC016307p;
import android.graphics.Rect;
import java.util.List;

/* loaded from: classes.dex */
public class RenderTreeNode {
    public List A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Rect A04;
    public final Rect A05;
    public final RenderTreeNode A06;
    public final AbstractC016307p A07;
    public final Object A08;

    public RenderTreeNode(RenderTreeNode renderTreeNode, AbstractC016307p abstractC016307p, Object obj, Rect rect, Rect rect2, int i) {
        this.A06 = renderTreeNode;
        this.A07 = abstractC016307p;
        this.A08 = obj;
        this.A04 = rect;
        this.A01 = renderTreeNode != null ? rect.left + 0 : 0;
        this.A02 = renderTreeNode != null ? rect.top + 0 : 0;
        this.A05 = rect2;
        this.A03 = i;
    }
}
