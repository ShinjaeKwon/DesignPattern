package com.design.patterns.behavior.mediator;

public class Door extends Participant {

	private boolean bClosed = false;

	public Door(Mediator mediator) {
		super(mediator);
	}

	public void open() {
		if (!bClosed)
			return;
		bClosed = false;

		mediator.participantChanged(this);
	}

	public void close() {
		if (bClosed)
			return;
		bClosed = true;

		mediator.participantChanged(this);
	}

	public boolean isbClosed() {
		return bClosed;
	}

	@Override
	public String toString() {
		return bClosed ? "# 문: 닫힘" : "# 문: 열림";
	}
}
