package X;

import android.view.View;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.Jid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2af  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52402af implements C29a {
    public final /* synthetic */ SearchViewModel A00;

    @Override // X.C29a
    public void A6A() {
    }

    @Override // X.C29a
    public AbstractC005302j AAU() {
        return null;
    }

    @Override // X.C29a
    public boolean ARL(Jid jid) {
        return false;
    }

    public C52402af(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    @Override // X.C29a
    public List ACQ() {
        return this.A00.A0n.A0G.A04();
    }

    @Override // X.C29a
    public Set AD1() {
        return new HashSet();
    }

    @Override // X.C29a
    public void AIW(AbstractC005302j abstractC005302j, ViewHolder viewHolder) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0G.A0B(Boolean.FALSE);
        searchViewModel.A0F(1);
        if (abstractC005302j != null) {
            searchViewModel.A0M.A0B(abstractC005302j);
        }
    }

    @Override // X.C29a
    public void AIX(AbstractC005302j abstractC005302j, View view, SelectionCheckView selectionCheckView) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0G.A0B(Boolean.FALSE);
        if (abstractC005302j != null) {
            searchViewModel.A0O.A0B(abstractC005302j);
        }
    }

    @Override // X.C29a
    public void AIY(AnonymousClass092 anonymousClass092, ViewHolder viewHolder) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0L(false);
        searchViewModel.A0F(2);
        searchViewModel.A0T.A0B(anonymousClass092);
    }

    @Override // X.C29a
    public void AIZ(C05160No c05160No) {
        Log.e("SearchViewModel/pending group in search results");
    }

    @Override // X.C29a
    public void ALf(AbstractC005302j abstractC005302j, View view, SelectionCheckView selectionCheckView) {
        this.A00.A0N.A0B(abstractC005302j);
    }
}
