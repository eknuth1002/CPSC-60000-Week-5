package com.elliotknuth;

public enum FiringSpeed {
	FAST {
		@Override
		public String toString() {
			return "270F/hour";
		}
	}, 
	SLOW {
		@Override
		public String toString() {
			return "27F/hour";
		}
	}, 
	NORMAL{
		@Override
		public String toString() {
			return "108F/hour";
		}
	};
}
