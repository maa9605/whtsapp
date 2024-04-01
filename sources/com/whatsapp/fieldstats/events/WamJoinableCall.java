package com.whatsapp.fieldstats.events;

import X.AnonymousClass014;

/* loaded from: classes.dex */
public final class WamJoinableCall extends AnonymousClass014 {
    public String callRandomId;
    public Boolean isPendingCall;
    public Boolean isRejoin;
    public Boolean isRering;
    public Boolean joinableAcceptBeforeLobbyAck;
    public Boolean joinableDuringCall;
    public Boolean joinableEndCallBeforeLobbyAck;
    public Integer legacyCallResult;
    public Integer lobbyEntryPoint;
    public Integer lobbyExit;
    public Long lobbyExitNackCode;
    public Boolean lobbyQueryWhileConnected;
    public Long lobbyVisibleT;
    public Long numConnectedPeers;
    public Long numInvitedParticipants;
    public Boolean previousJoinNotEnded;
    public Boolean videoEnabled;

    public WamJoinableCall() {
        super(2572, AnonymousClass014.DEFAULT_SAMPLING_RATE, 0);
    }
}
