package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.3KV  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3KV extends AbstractC09080cc {
    @Override // X.AbstractC09080cc
    public boolean A0H() {
        return true;
    }

    public C3KV(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gif_search_preview, viewGroup, false));
    }
}
