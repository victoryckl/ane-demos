package com.example.helloanenative
{
	import flash.events.EventDispatcher;
	import flash.events.IEventDispatcher;
	import flash.external.ExtensionContext;
	
	public class Vibrate extends EventDispatcher
	{
		private static var extContext:ExtensionContext = null;
		public function Vibrate(target:IEventDispatcher=null)
		{
			super(target);
		}
	}
}