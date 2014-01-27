package com.example.helloanenative
{
	import flash.events.EventDispatcher;
	import flash.events.IEventDispatcher;
	import flash.external.ExtensionContext;
	
	public class Vibrate extends EventDispatcher {
		private static var extContext:ExtensionContext = null;
		
		public function Vibrate(target:IEventDispatcher=null) {
			super(target);
			if (!extContext) {
				extContext = ExtensionContext.createExtensionContext("com.example.helloanenative.Vibrate", "vibrate");
				extContext.call("initMe");
			}
		}
		
		public static function get isSupported():Boolean {
			var supported:Boolean = false;
			supported = extContext.call("isSupported") as Boolean;
			return supported;
		}
		
		public function vibrate(duration:Number):void {
			extContext.call("vibrateMe", duration);
		}
	}
}