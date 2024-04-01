package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.chatinfo.ChatInfoLayout;

/* renamed from: X.2pA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC57352pA extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ChatInfoLayout A01;

    public RunnableC57352pA(ChatInfoLayout chatInfoLayout, int i) {
        this.A01 = chatInfoLayout;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        ChatInfoLayout chatInfoLayout = this.A01;
        View childAt = chatInfoLayout.A0D.getChildAt(0);
        if (childAt != null && chatInfoLayout.A0D.getFirstVisiblePosition() == 0) {
            int top = childAt.getTop();
            int i = this.A00;
            if (top != i) {
                chatInfoLayout.A0D.setSelectionFromTop(0, i);
                chatInfoLayout.A0D.post(this);
                return;
            }
            ((ActivityC02330At) C018308n.A00(chatInfoLayout.getContext())).A0T();
            chatInfoLayout.A0D.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: X.2p9
                @Override // android.widget.AbsListView.OnScrollListener
                public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
                    ChatInfoLayout.A00(RunnableC57352pA.this.A01);
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScrollStateChanged(AbsListView absListView, int i2) {
                    ChatInfoLayout.A00(RunnableC57352pA.this.A01);
                }
            });
        }
    }
}
