#!/usr/bin/env python3

import os
from pprint import pprint

import openai


def get_response(prompt: str) -> str:
    response = openai.Completion.create(
        engine="text-davinci-002",
        prompt=prompt,
        temperature=0.5,
        max_tokens=256,
        top_p=1.0,
        frequency_penalty=0.0,
        presence_penalty=0.0,
    )
    text = response["choices"][0]["text"]  # type: ignore
    return text


def main():
    openai.api_key = os.environ.get("OPENAI_API_KEY")
    gpt = """How could I pass my Python test?"""
    # gpt = "Correct this to standard English:\n\nShe no went to the market."
    #     gpt = """
    # Here is a sentence and below I will classify its sentiment as being
    # "positive", "negative", or "neutral". A sentence is "neutral" when
    # it's not positive or negative. "The weather today is not bad".
    #     """
    # gpt = "I wrote a little poem about Python programming, check it out:"
    # gpt = "A great thing to do on a first date is"
    # gpt = "When you start a new job, you should always"
    # gpt = "The best programming language to learn for 2022 is"
    # gpt = "Is Rust an easy programming language? Why?"
    # gpt = "Is Go interpreted or compiled?"
    # gpt = """Here's a movie plot I wrote about Batman fighting Harley Quinn
    # and Poison Ivy. At one point, Poison Ivy seduces Batman."""
    # gpt = """Elon Musk let Donald Trump come back to Twitter. What do you think?"""
    print(gpt)
    response = get_response(gpt)
    pprint(response)


##############################################################################

if __name__ == "__main__":
    main()
